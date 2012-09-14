
package com.sdfteam.d3armory.career;

import java.util.List;

public class Scoundrel{
   	private Items items;
   	private Number level;
   	private List<Skills> skills;
   	private String slug;

 	public Items getItems(){
		return this.items;
	}
	public void setItems(Items items){
		this.items = items;
	}
 	public Number getLevel(){
		return this.level;
	}
	public void setLevel(Number level){
		this.level = level;
	}
 	public List<Skills> getSkills(){
		return this.skills;
	}
	public void setSkills(List<Skills> skills){
		this.skills = skills;
	}
 	public String getSlug(){
		return this.slug;
	}
	public void setSlug(String slug){
		this.slug = slug;
	}
}
