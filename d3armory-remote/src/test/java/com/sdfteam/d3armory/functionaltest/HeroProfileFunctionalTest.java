package com.sdfteam.d3armory.functionaltest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.sdfteam.d3armory.config.TestConfig;
import com.sdfteam.d3armory.domain.career.CareerProfile;
import com.sdfteam.d3armory.domain.career.Hero;
import com.sdfteam.d3armory.domain.hero.HeroProfile;
import com.sdfteam.d3armory.service.configuration.Configuration;
import com.sdfteam.d3armory.service.remote.RemoteService;
import com.sdfteam.d3armory.service.remote.ServiceFactory;
import com.sdfteam.d3armory.service.remote.exception.D3ServerCommunicationException;

public class HeroProfileFunctionalTest {

	private Configuration configuration;

	@Before
	public void setUp() {
		configuration = new Configuration();
		configuration.setBattleTag(TestConfig.TAG_NAME);
		configuration.setBattleTagCode(TestConfig.TAG_CODE);
		configuration.setHost(TestConfig.SERVER_HOST);
	}

	@Test
	public void testGsonFromWeb() throws IllegalAccessException, IOException,
			InvocationTargetException, NoSuchMethodException {

		ServiceFactory serviceFactory = new ServiceFactory();
		RemoteService<CareerProfile> careerService = serviceFactory
				.getService(CareerProfile.class);
		try {
			CareerProfile career = careerService.receiveEntity(configuration);
			List<Hero> heroes = career.getHeroes();
			Hero hero = heroes.get(0);
			configuration.setHeroId(hero.getId() + 1);

			RemoteService<HeroProfile> heroService = serviceFactory
					.getService(HeroProfile.class);
			HeroProfile heroProfile = heroService.receiveEntity(configuration);

			Gson g = new Gson();
			String json = g.toJson(heroProfile);
			System.out.println("gson:" + json);

			String value = heroProfile.getItems().getBracers().getName();
			System.out.println(value);
		} catch (D3ServerCommunicationException e) {
			System.out.println("Error during accessing hero profile: "
					+ e.getErrorEntity().getCode() + " - "
					+ e.getErrorEntity().getReason());
		}

	}
}
