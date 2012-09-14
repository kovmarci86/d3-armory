package com.sdfteam.d3armory.service.configuration;

import java.util.LinkedHashMap;

/**
 * Represents a d3 server configuration with character identification.
 * 
 * @author NoTiCe
 * 
 */
@SuppressWarnings("serial")
public class Configuration extends LinkedHashMap<String, Object> {
	public static final String BATTLETAG_CODE_TAG = "<battletag-code>";
	public static final String BATTLETAG_NAME_TAG = "<battletag-name>";
	public static final String HOST_TAG = "<host>";
	public static final String HERO_ID = "<hero-id>";

	/**
	 * Clones the mappings of the underlying map. This is not a deep copy.
	 * 
	 * @param configuration
	 *            The source configuration to clone.
	 */
	public Configuration(Configuration configuration) {
		super(configuration);
	}

	/**
	 * Default constructor, creates an empty configuration.
	 */
	public Configuration() {
	}

	public String getHost() {
		return (String) get(HOST_TAG);
	}

	public void setHost(String host) {
		put(HOST_TAG, host);
	}

	public String getBattleTag() {
		return (String) get(BATTLETAG_NAME_TAG);
	}

	public void setBattleTag(String battleTag) {
		put(BATTLETAG_NAME_TAG, battleTag);
	}

	public Long getBattleTagCode() {
		return (Long) get(BATTLETAG_CODE_TAG);
	}

	public void setBattleTagCode(Long battleTagCode) {
		put(BATTLETAG_CODE_TAG, battleTagCode);
	}

	public void setHeroId(Long id) {
		put(HERO_ID, id);
	}

	public Long getHeroId() {
		return (Long) get(HERO_ID);
	}

	/**
	 * Clones the configuration using the Configuration(Configuration source)
	 * constructor.
	 */
	public Configuration clone() {
		return new Configuration(this);
	}
}
