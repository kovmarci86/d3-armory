package com.sdfteam.d3armory.service.configuration;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Test;

public class ConfigurationServiceTest {

	@SuppressWarnings("unchecked")
	@Test
	public void testDecorateUrl() {
		// GIVEN
		IMocksControl mc = EasyMock.createControl();
		String url = "foo[x]bar";
		Configuration conf = mc.createMock(Configuration.class);
		Set<Entry<String, Object>> entrySet = new HashSet<Entry<String, Object>>();
		Entry<String, Object> entry = mc.createMock(Entry.class);
		entrySet.add(entry);

		ConfigurationService sut = new ConfigurationService();

		// EXPECT
		expect(conf.entrySet())
				.andReturn((Set<Entry<String, Object>>) entrySet);
		expect(entry.getKey()).andReturn("[x]").anyTimes();
		expect(entry.getValue()).andReturn("bar").anyTimes();

		// WHEN
		mc.replay();
		String result = sut.decorateUrl(url, conf);

		// THEN
		assertEquals("Expected to replace message params.", "foobarbar", result);
		mc.verify();
	}

}
