package com.mediatheque.entity;

import javax.persistence.*;

@Entity
@Table(name="dvd")
public class Dvd extends Items {
	
	@Column(name= "realisateur", nullable=false)
	private String realisateur;
	
	@Column(name= "duree", nullable=false)
	private float duree;
	
	@Column(name= "dvdtype", nullable=false)
	@Enumerated(EnumType.STRING)
	private DvdType dvdType;

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public DvdType getDvdType() {
		return dvdType;
	}

	public void setDvdType(DvdType dvdType) {
		this.dvdType = dvdType;
	}
	
}