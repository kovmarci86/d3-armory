package com.sdfteam.d3armory.service.remote;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import static org.easymock.EasyMock.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sdfteam.d3armory.service.annotation.RemoteConfiguration;
import com.sdfteam.d3armory.service.configuration.Configuration;
import com.sdfteam.d3armory.service.configuration.ConfigurationService;
import com.sdfteam.d3armory.service.remote.gson.SpringGsonConverter;

@PrepareForTest(value = { SpringRemoteService.class })
@RunWith(PowerMockRunner.class)
public class SpringRemoteServiceTest {
	public static final String FOO_BAR_URL = "fooBar";
	private static final String BAR_FOO_URL = "barFoo";

	@SuppressWarnings("unchecked")
	@Test
	public void testReceiveEntityWithGoodResult() throws Exception {
		// GIVEN
		ConfigurationService configurationService = PowerMock
				.createMock(ConfigurationService.class);
		Configuration configuration = PowerMock.createMock(Configuration.class);
		RestTemplate restTemplate = PowerMock.createMock(RestTemplate.class);
		SpringGsonConverter<TestEntity> gsonConverter = PowerMock
				.createMock(SpringGsonConverter.class);
		ResponseEntity<TestEntity> responseEntity = PowerMock
				.createMock(ResponseEntity.class);
		TestEntity result = new TestEntity();

		// EXPECT
		PowerMock.expectNew(ConfigurationService.class).andReturn(
				configurationService);
		PowerMock.expectNew(SpringGsonConverter.class, TestEntity.class)
				.andReturn(gsonConverter);
		PowerMock.expectNew(RestTemplate.class).andReturn(restTemplate);
		expect(configurationService.decorateUrl(FOO_BAR_URL, configuration))
				.andReturn(BAR_FOO_URL);
		restTemplate.setMessageConverters(EasyMock.anyObject(List.class));
		expect(restTemplate.getForEntity(BAR_FOO_URL, TestEntity.class))
				.andReturn(responseEntity);
		expect(responseEntity.getBody()).andReturn(result);

		PowerMock.replay(RestTemplate.class, ConfigurationService.class,
				SpringGsonConverter.class, responseEntity, restTemplate,
				configurationService, configuration, gsonConverter);

		// WHEN
		SpringRemoteService<TestEntity> sut = new SpringRemoteService<TestEntity>(
				TestEntity.class);
		TestEntity receiveEntity = sut.receiveEntity(configuration);

		// THEN
		assertEquals("Wrong object for result.", result, receiveEntity);
		PowerMock.verify(RestTemplate.class, ConfigurationService.class,
				SpringGsonConverter.class, responseEntity, restTemplate,
				configurationService, configuration, gsonConverter);
	}

	@RemoteConfiguration(url = FOO_BAR_URL)
	public static class TestEntity extends RemoteEntity {
	}
}
