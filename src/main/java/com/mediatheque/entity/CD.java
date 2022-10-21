package com.mediatheque.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.mediatheque.entity.Items;

@Entity
@Table(name="cd")
public class CD extends Items {
	
	@Column(name= "artiste", nullable=false)
	private String artiste;
	
	@Column(name= "nbtitres", nullable=false)
	private long nbTitres;
	
	@Column(name= "duree", nullable=false)
	private float duree;
	
	public String getArtiste() {
		return artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}
	
	public long getNbTitres() {
		return nbTitres;
	}

	public void setNbTitres(long nbTitres) {
		this.nbTitres = nbTitres;
	}
	
}

