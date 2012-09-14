package com.sdfteam.d3armory.service.configuration;

import java.util.Map.Entry;
import java.util.Set;

/**
 * Retrieves customized parameters from configuration.
 * 
 * @author NoTiCe
 * 
 */
public class ConfigurationService {

	/**
	 * Replaces common url properties to values.
	 * 
	 * @param url
	 *            The url to replace configuration parameters with real ones.
	 * @param configuration
	 *            The source of the configuration parameters to replace.
	 * @return The result;
	 */
	public String decorateUrl(String url, Configuration configuration) {
		String result = url;
		if (result != null) {
			Set<Entry<String, Object>> entrySet = configuration.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				result = result.replace(entry.getKey(),
						String.valueOf(entry.getValue()));

			}
		}
		return result;
	}

}
