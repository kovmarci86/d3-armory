package com.sdfteam.d3armory.domain.artisanblacksmith;

import java.util.List;

public class Levels {
	private Number percent;
	private List<TrainedRecipes> taughtRecipes;
	private Number tier;
	private Number tierLevel;
	private List<TrainedRecipes> trainedRecipes;
	private Number upgradeCost;

	public Number getPercent() {
		return this.percent;
	}

	public void setPercent(Number percent) {
		this.percent = percent;
	}

	public List<TrainedRecipes> getTaughtRecipes() {
		return taughtRecipes;
	}

	public void setTaughtRecipes(List<TrainedRecipes> taughtRecipes) {
		this.taughtRecipes = taughtRecipes;
	}

	public Number getTier() {
		return tier;
	}

	public void setTier(Number tier) {
		this.tier = tier;
	}

	public Number getTierLevel() {
		return tierLevel;
	}

	public void setTierLevel(Number tierLevel) {
		this.tierLevel = tierLevel;
	}

	public List<TrainedRecipes> getTrainedRecipes() {
		return trainedRecipes;
	}

	public void setTrainedRecipes(List<TrainedRecipes> trainedRecipes) {
		this.trainedRecipes = trainedRecipes;
	}

	public Number getUpgradeCost() {
		return upgradeCost;
	}

	public void setUpgradeCost(Number upgradeCost) {
		this.upgradeCost = upgradeCost;
	}

}
