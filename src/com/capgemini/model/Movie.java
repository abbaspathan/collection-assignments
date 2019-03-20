package com.capgemini.model;

public class Movie {

	private String movieName;
	private String leadActor;
	private String leadActress;

	public Movie() {
		super();
	}

	public Movie(String movieName, String leadActor, String leadActress) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

}
