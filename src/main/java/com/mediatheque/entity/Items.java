package com.mediatheque.entity;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@Table(name="items")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_sequence_generator")
	@SequenceGenerator(name = "item_sequence_generator", allocationSize = 1)
	private Long id;
	
	@Column(name= "titres", nullable=false)
	private String titres;
	
	@Column(name= "exemplaires", nullable=false)
	private String exemplaires;
	
	@Column(name= "date_parution", nullable=false)
	private LocalDate dateParution;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitres() {
		return titres;
	}

	public void setTitres(String titres) {
		this.titres = titres;
	}

	public String getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(String exemplaires) {
		this.exemplaires = exemplaires;
	}

	public LocalDate getDateParution() {
		return dateParution;
	}

	public void setDateParution(LocalDate dateParution) {
		this.dateParution = dateParution;
	}

}