package com.sdfteam.d3armory.service.remote.gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.google.gson.Gson;
import com.sdfteam.d3armory.service.remote.RemoteEntity;
import com.sdfteam.d3armory.service.remote.exception.D3ServerCommunicationException;

/**
 * Basic implementation of Spring Gson converter.
 * 
 * @author NoTiCe
 * 
 * @param <T>
 */
public class SpringGsonConverter<T> implements HttpMessageConverter<T> {

	private Class<T> clazz;
	private Gson gson;

	/**
	 * Creates the converter confiured with the requested class to convert with
	 * Gson.
	 * 
	 * @param clazz
	 *            the Class to use.
	 */
	public SpringGsonConverter(Class<T> clazz) {
		this.clazz = clazz;
		this.gson = new Gson();
	}

	public boolean canRead(Class<?> clazz, MediaType arg1) {
		return this.clazz.equals(clazz);
	}

	public boolean canWrite(Class<?> clazz, MediaType arg1) {
		return this.clazz.equals(clazz);
	}

	public List<MediaType> getSupportedMediaTypes() {
		return Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON });
	}

	public T read(Class<? extends T> clazz, HttpInputMessage message)
			throws IOException, HttpMessageNotReadableException {
		Reader jsonReader = new InputStreamReader(message.getBody());
		T resultObject = gson.fromJson(jsonReader, clazz);
		checkErrorEntity(resultObject);
		return resultObject;
	}

	private void checkErrorEntity(T resultObject)
			throws D3ServerCommunicationException {
		if (resultObject instanceof RemoteEntity) {
			RemoteEntity errorEntity = (RemoteEntity) resultObject;
			if (errorEntity.getCode() != null) {
				throw new D3ServerCommunicationException(errorEntity);
			}
		}
	}

	public void write(T object, MediaType mediaType, HttpOutputMessage message)
			throws IOException, HttpMessageNotWritableException {
		Writer writer = new OutputStreamWriter(message.getBody());
		gson.toJson(object, writer);
	}

}
