package com.sdfteam.d3armory.domain.career;

public class Hero {
	private String name;
	private Long id;
	private Number level;
	private Boolean hardcore;
	private Number gender;
	private Number lastUpdated;
	private Boolean dead;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Number getLevel() {
		return level;
	}

	public void setLevel(Number level) {
		this.level = level;
	}

	public Boolean getHardcore() {
		return hardcore;
	}

	public void setHardcore(Boolean hardcore) {
		this.hardcore = hardcore;
	}

	public Number getGender() {
		return gender;
	}

	public void setGender(Number gender) {
		this.gender = gender;
	}

	public Number getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Number lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Boolean getDead() {
		return dead;
	}

	public void setDead(Boolean dead) {
		this.dead = dead;
	}

}
