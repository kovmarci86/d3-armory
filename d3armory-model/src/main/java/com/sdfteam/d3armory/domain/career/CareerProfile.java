package com.sdfteam.d3armory.domain.career;

import java.util.List;

import com.sdfteam.d3armory.service.annotation.RemoteConfiguration;
import com.sdfteam.d3armory.service.remote.RemoteEntity;

/**
 * Retrieves CareerProfile battletag-name ::= <regional battletag allowed
 * characters> battletag-code ::= <integer> url ::= <host> "/api/d3/profile/"
 * <battletag-name> "-" <battletag-code> "/"
 * 
 * @author NoTiCe
 */
@RemoteConfiguration(url = "http://<host>/api/d3/profile/<battletag-name>-<battletag-code>/")
public class CareerProfile extends RemoteEntity {
	private List<Artisans> artisans;
	private String battleTag;
	private List<ItemSet> Itemes;
	private List<Artisans> hardcoreArtisans;
	private Progression hardcoreProgression;
	private List<Hero> heroes;
	private KillsInfo kills;
	private Number lastHeroPlayed;
	private Number lastUpdated;
	private Progression progression;
	private TimePlayed timePlayed;

	public List<Artisans> getArtisans() {
		return this.artisans;
	}

	public void setArtisans(List<Artisans> artisans) {
		this.artisans = artisans;
	}

	public String getBattleTag() {
		return this.battleTag;
	}

	public void setBattleTag(String battleTag) {
		this.battleTag = battleTag;
	}

	public List<ItemSet> getItemes() {
		return this.Itemes;
	}

	public KillsInfo getKills() {
		return kills;
	}

	public void setKills(KillsInfo kills) {
		this.kills = kills;
	}

	public void setItemes(List<ItemSet> Itemes) {
		this.Itemes = Itemes;
	}

	public List<Artisans> getHardcoreArtisans() {
		return this.hardcoreArtisans;
	}

	public void setHardcoreArtisans(List<Artisans> hardcoreArtisans) {
		this.hardcoreArtisans = hardcoreArtisans;
	}

	public Progression getHardcoreProgression() {
		return this.hardcoreProgression;
	}

	public void setHardcoreProgression(Progression hardcoreProgression) {
		this.hardcoreProgression = hardcoreProgression;
	}

	public List<Hero> getHeroes() {
		return this.heroes;
	}

	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}

	public Number getLastHeroPlayed() {
		return this.lastHeroPlayed;
	}

	public void setLastHeroPlayed(Number lastHeroPlayed) {
		this.lastHeroPlayed = lastHeroPlayed;
	}

	public Number getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Number lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Progression getProgression() {
		return this.progression;
	}

	public void setProgression(Progression progression) {
		this.progression = progression;
	}

	public TimePlayed getTimePlayed() {
		return this.timePlayed;
	}

	public void setTimePlayed(TimePlayed timePlayed) {
		this.timePlayed = timePlayed;
	}
}
