package com.mediatheque.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
//creation de la table
@Table(name="utilisateur")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "utilisateur_sequence_generator")
	@SequenceGenerator(name = "utilisateur_sequence_generator", allocationSize = 1)
	private Long id;
	
	@Column(name= "email", nullable=false)
	private String email;
	
	@Column(name= "mdp", nullable=false)
	private String mdp;
	
	//on va hasher le nom + prénom
	@Column(name= "prenom", nullable=false)
	private String prenom;
	
	@Column(name= "nom", nullable=false)
	private String nom;
	
	@OneToMany//(mappedBy = "utilisateur")
    private Set<Emprunt> empruntItems = new HashSet<Emprunt>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Set<Emprunt> getEmpruntItems() {
		return empruntItems;
	}

	public void setEmpruntItems(Set<Emprunt> empruntItems) {
		this.empruntItems = empruntItems;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}