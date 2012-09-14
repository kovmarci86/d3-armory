package com.sdfteam.d3armory.domain.hero;

import com.google.gson.annotations.SerializedName;
import com.sdfteam.d3armory.domain.career.ItemSet;
import com.sdfteam.d3armory.domain.career.KillsInfo;
import com.sdfteam.d3armory.domain.career.Progression;
import com.sdfteam.d3armory.domain.career.Stats;
import com.sdfteam.d3armory.service.annotation.RemoteConfiguration;
import com.sdfteam.d3armory.service.remote.RemoteEntity;

@RemoteConfiguration(url = "http://<host>/api/d3/profile/<battletag-name>-<battletag-code>/hero/<hero-id>")
public class HeroProfile extends RemoteEntity {
	@SerializedName("class")
	private String clazz;
	private FollowersList followers;
	private Number gender;
	private boolean hardcore;
	private Number id;
	private ItemSet items;
	private KillsInfo kills;
	@SerializedName("last-updated")
	private Number lastUpdated;
	private Number level;
	private String name;
	private Progression progress;
	private HeroSkillContainer skills;
	private Stats stats;

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public FollowersList getFollowers() {
		return followers;
	}

	public void setFollowers(FollowersList followers) {
		this.followers = followers;
	}

	public Number getGender() {
		return gender;
	}

	public void setGender(Number gender) {
		this.gender = gender;
	}

	public boolean isHardcore() {
		return hardcore;
	}

	public void setHardcore(boolean hardcore) {
		this.hardcore = hardcore;
	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public ItemSet getItems() {
		return items;
	}

	public void setItems(ItemSet items) {
		this.items = items;
	}

	public KillsInfo getKills() {
		return kills;
	}

	public void setKills(KillsInfo kills) {
		this.kills = kills;
	}

	public Number getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Number lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Number getLevel() {
		return level;
	}

	public void setLevel(Number level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Progression getProgress() {
		return progress;
	}

	public void setProgress(Progression progress) {
		this.progress = progress;
	}

	public HeroSkillContainer getSkills() {
		return skills;
	}

	public void setSkills(HeroSkillContainer skills) {
		this.skills = skills;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

}
