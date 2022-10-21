package com.mediatheque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mediatheque.entity.Items;
import com.mediatheque.entity.CD;
import com.mediatheque.entity.Dvd;
import com.mediatheque.entity.Livres;
@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {
	
	// Nb total items qui ont des copies dispo
	@Query("select i from Items i where i.exemplaires > 0")
	public List<Items> findDisponible();
	
	// Voir item en fct du type
	@Query("from Dvd")
	public List<Items> findAllDvd();
	
	@Query("from CD")
	public List<Items> findAllCD();
	
	@Query("from Livres")
	public List<Items> findAllLivres();
	
}