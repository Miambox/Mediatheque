package com.mediatheque.entity;

import javax.persistence.*;

@Entity
@Table(name="livres")
public class Livres extends Items {

	
	@Column(name= "ecrivain", nullable=false)
	private String ecrivain;
	
	@Column(name= "isbn", nullable=false)
	private Long isbn;

	public String getEcrivain() {
		return ecrivain;
	}

	public void setEcrivain(String ecrivain) {
		this.ecrivain = ecrivain;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
		
}
