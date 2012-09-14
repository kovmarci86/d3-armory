package com.sdfteam.d3armory.domain.career;

public class Artisans {
	private Number level;
	private String slug;
	private Number stepMax;
	private Number stepMurrent;

	public Number getLevel() {
		return this.level;
	}

	public void setLevel(Number level) {
		this.level = level;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Number getStepMax() {
		return this.stepMax;
	}

	public void setStepMax(Number stepMax) {
		this.stepMax = stepMax;
	}

	public Number getStepMurrent() {
		return this.stepMurrent;
	}

	public void setStepMurrent(Number stepMurrent) {
		this.stepMurrent = stepMurrent;
	}
}
