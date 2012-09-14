package com.sdfteam.d3armory.domain.artisanblacksmith;

import java.util.List;

public class Tiers {
	private List<Levels> levels;
	private Number tier;

	public List<Levels> getLevels() {
		return this.levels;
	}

	public void setLevels(List<Levels> levels) {
		this.levels = levels;
	}

	public Number getTier() {
		return this.tier;
	}

	public void setTier(Number tier) {
		this.tier = tier;
	}
}
