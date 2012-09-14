package com.sdfteam.d3armory.service.remote;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.sdfteam.d3armory.service.annotation.RemoteConfiguration;
import com.sdfteam.d3armory.service.configuration.Configuration;
import com.sdfteam.d3armory.service.configuration.ConfigurationService;
import com.sdfteam.d3armory.service.remote.exception.D3ServerCommunicationException;
import com.sdfteam.d3armory.service.remote.gson.SpringGsonConverter;
import com.sdfteam.d3armory.service.util.AnnotationUtils;

/**
 * An Remote service provides access to entities trough Spring RestTemplate and
 * GSon.
 * 
 * @author NoTiCe
 * 
 * @param <T extends RemoteEntity> The type of the entity. Must be a
 *        RemoteEntity
 */
public class SpringRemoteService<T extends RemoteEntity> implements
		RemoteService<T> {

	private Class<T> clazz;
	private ConfigurationService configurationService;
	private List<HttpMessageConverter<?>> messageConverters;
	private RestTemplate template;

	/**
	 * Creates the service, initializes messageConverters.
	 * 
	 * @param clazz
	 *            The class of the remote service response.
	 */
	public SpringRemoteService(Class<T> clazz) {
		this.clazz = clazz;
		if (!AnnotationUtils.hasAnnotation(clazz, RemoteConfiguration.class)) {
			throw new IllegalArgumentException("Class " + clazz
					+ " must have a configuration annotation.");
		}
		configurationService = new ConfigurationService();
		messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(new SpringGsonConverter<T>(clazz));
	}

	public T receiveEntity(Configuration configuration)
			throws D3ServerCommunicationException {
		RemoteConfiguration annotation = clazz
				.getAnnotation(RemoteConfiguration.class);
		T result = null;
		try {
			result = receiveEntity(configurationService.decorateUrl(
					annotation.url(), configuration));
		} catch (RuntimeException rae) {
			Throwable cause = rae.getCause();
			if (cause instanceof D3ServerCommunicationException) {
				throw (D3ServerCommunicationException) cause;
			} else {
				throw rae;
			}
		}
		return result;

	}

	private T receiveEntity(String url) {
		RestTemplate template = getTemplate();
		ResponseEntity<T> resultEntity = template.getForEntity(url, clazz);
		return resultEntity.getBody();
	}

	private RestTemplate getTemplate() {
		if (template == null) {
			template = new RestTemplate();
			template.setMessageConverters(messageConverters);
		}
		return template;
	}
}
