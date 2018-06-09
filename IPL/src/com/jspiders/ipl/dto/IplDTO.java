package com.jspiders.ipl.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ipl_table")

public class IplDTO implements Serializable {
	@Id
	@Column(name ="id")
	private int id;
	
	@Column(name ="teamName")
	private String teamName;
	
	@Column(name ="noOfPlayers")
	private int noOfPlayers;
	
	@Column(name ="buget")
	private double buget;
	
	@Column(name ="noOfMatches")
	private int noOfMatches;
	
	@Column(name ="owner")
	private String owner;
	
	public IplDTO() {
		
		System.out.println(this.getClass().getCanonicalName() + " created");
	}
	
	public int getId() {
		return id;
	} 

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public double getBuget() {
		return buget;
	}

	public void setBuget(double buget) {
		this.buget = buget;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	public String toString(){
		
		return id+" " + teamName+" " + noOfPlayers+" " + buget+" " + noOfMatches+" " +owner;
	}

	
}
