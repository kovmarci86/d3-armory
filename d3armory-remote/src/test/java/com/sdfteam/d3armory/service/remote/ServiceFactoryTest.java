package com.sdfteam.d3armory.service.remote;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ServiceFactoryTest {

	@Test
	public void testGetService() {
		// GIVEN
		Class<RemoteEntity> clazz = RemoteEntity.class;
		// EXPECT

		// WHEN
		ServiceFactory sut = new ServiceFactory();
		RemoteService<RemoteEntity> service = sut.getService(clazz);

		// THEN
		assertNotNull("Service must not be null.", service);
	}

}
