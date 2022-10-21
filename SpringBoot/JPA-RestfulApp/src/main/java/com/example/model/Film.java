package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
	private int id;
	private String title;
	private int releaseYear;
	private String director;
	private long boxOffice;
	private String genre;
	private String platform;
	private int duration;
	private String language;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String BoxOffice() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public long getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(long boxOffice) {
		this.boxOffice = boxOffice;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public String getTitle() {
		return title;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Film(int id, String title, int releaseYear, String director, long boxOffice, String genre, String platform,
			int duration, String language) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.director = director;
		this.boxOffice = boxOffice;
		this.genre = genre;
		this.platform = platform;
		this.duration = duration;
		this.language = language;
	}

	public Film() {
		super();
	}

}
