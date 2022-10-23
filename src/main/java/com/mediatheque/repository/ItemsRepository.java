package com.mediatheque.repository;

import java.util.Calendar;
import java.util.Date;
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
	
	//Tri des items en fonction de la date de parution (comprise entre 0 et 7j pour les nouveautés
//	@Query("FROM Items WHERE date <= date_parution <= : date + 7 ")
//	List<Items> findAllItemsByDateParution();
//	
	//Nb total items qui ont des copies dispo
	@Query("FROM Items WHERE exemplaires > 0")
    List<Items> FindAllItemsByNbExemplaires();
	
	//Voir TOUT
	@Query("FROM Items")
	List<Items> findAllItems();
	
	// Voir items en fct du type
	
	@Query("FROM Dvd")
	List<Items> findAllDvd();
	
	@Query("FROM CD")
	List<Items> findAllCD();
	
	@Query("FROM Livres")
	List<Items> findAllLivres();

}