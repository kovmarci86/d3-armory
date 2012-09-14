package com.sdfteam.d3armory.domain.career;

import com.google.gson.annotations.SerializedName;

public class TimePlayed {
	private Number barbarian;
	@SerializedName("demon-hunter")
	private Number demonHunter;
	private Number monk;
	@SerializedName("witch-doctor")
	private Number witchDoctor;
	private Number wizard;

	public Number getBarbarian() {
		return barbarian;
	}

	public void setBarbarian(Number barbarian) {
		this.barbarian = barbarian;
	}

	public Number getDemonHunter() {
		return demonHunter;
	}

	public void setDemonHunter(Number demonHunter) {
		this.demonHunter = demonHunter;
	}

	public Number getMonk() {
		return monk;
	}

	public void setMonk(Number monk) {
		this.monk = monk;
	}

	public Number getWitchDoctor() {
		return witchDoctor;
	}

	public void setWitchDoctor(Number witchDoctor) {
		this.witchDoctor = witchDoctor;
	}

	public Number getWizard() {
		return wizard;
	}

	public void setWizard(Number wizard) {
		this.wizard = wizard;
	}

}
