package com.sdfteam.d3armory.domain.hero;

import java.util.List;

public class HeroSkillContainer {
	private List<Skill> active;
	private List<Skill> passive;

	public List<Skill> getActive() {
		return active;
	}

	public void setActive(List<Skill> active) {
		this.active = active;
	}

	public List<Skill> getPassive() {
		return passive;
	}

	public void setPassive(List<Skill> passive) {
		this.passive = passive;
	}

}
