package com.sdfteam.d3armory.domain.hero;

import java.util.List;

public class Follower {
	private FollowerItemSet items;
	private Number level;
	private List<Skill> skills;
	private String slug;

	public FollowerItemSet getItems() {
		return items;
	}

	public void setItems(FollowerItemSet items) {
		this.items = items;
	}

	public Number getLevel() {
		return level;
	}

	public void setLevel(Number level) {
		this.level = level;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
