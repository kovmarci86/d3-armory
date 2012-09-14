package com.sdfteam.d3armory.functionaltest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import com.google.gson.Gson;
import com.sdfteam.d3armory.config.TestConfig;
import com.sdfteam.d3armory.domain.career.CareerProfile;
import com.sdfteam.d3armory.service.configuration.Configuration;
import com.sdfteam.d3armory.service.remote.RemoteService;
import com.sdfteam.d3armory.service.remote.ServiceFactory;
import com.sdfteam.d3armory.service.remote.exception.D3ServerCommunicationException;

public class ArtisanBlacksmithFunctionalTest {
	@Test
	public void testGsonFromWebWithSuccess() throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException, IOException {
		ServiceFactory serviceFactory = new ServiceFactory();

		Configuration configuration = new Configuration();
		configuration.setBattleTag(TestConfig.TAG_NAME);
		configuration.setBattleTagCode(TestConfig.TAG_CODE);
		configuration.setHost(TestConfig.SERVER_HOST);

		RemoteService<CareerProfile> careerService = serviceFactory
				.getService(CareerProfile.class);
		CareerProfile career = careerService.receiveEntity(configuration);

		Gson g = new Gson();
		String json = g.toJson(career);
		System.out.println("gson:" + json);
	}

	@Test(expected = D3ServerCommunicationException.class)
	public void testGsonFromWebWithError() throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException, IOException {
		ServiceFactory serviceFactory = new ServiceFactory();

		Configuration configuration = new Configuration();
		configuration.setBattleTag("fooBar");
		configuration.setBattleTagCode(1111L);
		configuration.setHost("eu.battle.net");

		RemoteService<CareerProfile> careerService = serviceFactory
				.getService(CareerProfile.class);
		CareerProfile career = careerService.receiveEntity(configuration);

		Gson g = new Gson();
		String json = g.toJson(career);
		System.out.println("gson:" + json);
	}
}
