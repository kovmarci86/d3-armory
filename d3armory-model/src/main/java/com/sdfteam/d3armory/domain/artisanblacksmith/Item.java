package com.sdfteam.d3armory.domain.artisanblacksmith;

import com.sdfteam.d3armory.service.annotation.DataType;
import com.sdfteam.d3armory.service.annotation.RemoteData;

/**
 * Represents a single item, with links to the resources.
 * 
 * @author NoTiCe
 * 
 */
public class Item {
	private String displayColor;
	@RemoteData(type = DataType.IMAGE)
	private String icon;
	private String name;
	@RemoteData(type = DataType.HTML)
	private String tooltipParams;
	private Number requiredLevel;

	public String getDisplayColor() {
		return this.displayColor;
	}

	public void setDisplayColor(String displayColor) {
		this.displayColor = displayColor;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTooltipParams() {
		return this.tooltipParams;
	}

	public void setTooltipParams(String tooltipParams) {
		this.tooltipParams = tooltipParams;
	}

	public Number getRequiredLevel() {
		return requiredLevel;
	}

	public void setRequiredLevel(Number requiredLevel) {
		this.requiredLevel = requiredLevel;
	}
}
