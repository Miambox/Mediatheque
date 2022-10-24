package com.mediatheque.repository;

import java.util.List;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mediatheque.entity.Emprunt;
import com.mediatheque.entity.User;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
	//Trouver un user avec son ID + tous les emprunts associés
//	@Query("SELECT utilisateur_id FROM Emprunt UNION SELECT id FROM Utilisateur")
//	List<Emprunt> findEmpruntById(User user);
}