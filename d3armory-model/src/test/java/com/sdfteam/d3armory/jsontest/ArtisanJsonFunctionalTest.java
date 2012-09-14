package com.sdfteam.d3armory.jsontest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.sdfteam.d3armory.domain.career.CareerProfile;
import com.sdfteam.d3armory.util.NumberFactory;

import flexjson.JSONDeserializer;

public class ArtisanJsonFunctionalTest {
	@Test
	public void testWithFlexJsonExpectSuccess() throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException, IOException {
		JSONDeserializer<CareerProfile> deser = new JSONDeserializer<CareerProfile>();
		String file = FileUtils.readFileToString(new File(
				"example-json/career_profile.json"));

		Object artisan = deser.use(Number.class, new NumberFactory())
				.deserialize(file, CareerProfile.class);
		Map<?, ?> describe = BeanUtils.describe(artisan);
		System.out.println(describe);
	}
}
