package com.sdfteam.d3armory.domain.artisanblacksmith;

import java.util.List;

public class TrainedRecipes {
	private Number cost;
	private ItemProduced itemProduced;
	private String name;
	private List<Reagents> reagents;
	private String slug;

	public Number getCost() {
		return this.cost;
	}

	public void setCost(Number cost) {
		this.cost = cost;
	}

	public ItemProduced getItemProduced() {
		return this.itemProduced;
	}

	public void setItemProduced(ItemProduced itemProduced) {
		this.itemProduced = itemProduced;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Reagents> getReagents() {
		return this.reagents;
	}

	public void setReagents(List<Reagents> reagents) {
		this.reagents = reagents;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
}
