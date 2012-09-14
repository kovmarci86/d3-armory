package com.sdfteam.d3armory.domain.career;

public class Progression {
	private DifficultyLevel normal;
	private DifficultyLevel nightmare;
	private DifficultyLevel hell;
	private DifficultyLevel inferno;

	public DifficultyLevel getNormal() {
		return normal;
	}

	public void setNormal(DifficultyLevel normal) {
		this.normal = normal;
	}

	public DifficultyLevel getNightmare() {
		return nightmare;
	}

	public void setNightmare(DifficultyLevel nightmare) {
		this.nightmare = nightmare;
	}

	public DifficultyLevel getHell() {
		return hell;
	}

	public void setHell(DifficultyLevel hell) {
		this.hell = hell;
	}

	public DifficultyLevel getInferno() {
		return inferno;
	}

	public void setInferno(DifficultyLevel inferno) {
		this.inferno = inferno;
	}

}
