package com.sdfteam.d3armory.domain.career;

import java.util.List;

/**
 * Represents an Act, with completition state.
 * 
 * @author NoTiCe
 * 
 */
public class Act {
	private boolean completed;
	private List<Quest> completedQuests;

	public boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public List<Quest> getCompletedQuests() {
		return this.completedQuests;
	}

	public void setCompletedQuests(List<Quest> completedQuests) {
		this.completedQuests = completedQuests;
	}
}
