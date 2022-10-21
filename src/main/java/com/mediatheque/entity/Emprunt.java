package com.mediatheque.entity;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="emprunt")
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emprunt_sequence_generator")
	@SequenceGenerator(name = "emprunt_sequence_generator", allocationSize = 1)
	private Long id;

	@Column(name= "date_emprunt", nullable=false)
	private LocalDateTime date_emprunt;
	
	//@Column(name= "nb_items", nullable=false)
	//private Instant nb_items;
	
	@Column(name= "date_retour", nullable=false)
	private LocalDateTime date_retour;
	
	@ManyToOne
    @JoinColumn(name="utilisateur_id", referencedColumnName ="id")
    private User user;
    
    @ManyToMany
    @JoinColumn(name="items_id")
    private List<Items> items;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDate_emprunt() {
		return date_emprunt;
	}

	public void setDate_emprunt(LocalDateTime date_emprunt) {
		this.date_emprunt = date_emprunt;
	}

	public LocalDateTime getDate_retour() {
		return date_retour;
	}

	public void setDate_retour(LocalDateTime date_retour) {
		this.date_retour = date_retour;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	


	
}
