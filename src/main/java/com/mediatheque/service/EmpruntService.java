package com.mediatheque.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mediatheque.entity.Emprunt;
import com.mediatheque.entity.Items;
import com.mediatheque.entity.User;
import com.mediatheque.repository.EmpruntRepository;
import com.mediatheque.repository.ItemsRepository;
import com.mediatheque.repository.UserRepository;

@Service
@Transactional
public class EmpruntService {

	@Autowired
	EmpruntRepository empruntRepository;

	@Autowired
	ItemsRepository itemsRepository;

	@Autowired
	UserRepository userRepository;

	//Faire emprunt
	//On récupère la liste des items + id de user
	public Emprunt effectuerEmprunt(User id, List<Long> items) 
			throws EntityNotFoundException, ItemsNotAvailableException, EmpruntLimitReachedException {{

				//1) UTILISATEUR ? (via son Id)
				User utilisateurFound = userRepository.findById(id)
						.orElseThrow(() -> new EntityNotFoundException("cet utilisateur n'existe pas"));

				//a- initialisation du panier

				List<Items> itemsDuPanier = new ArrayList<>();

				//2) ITEM ? (via son Id)
				for (Long idItem: items) {
					Items itemFound = itemsRepository.findById(idItem)
							.orElseThrow(() -> new EntityNotFoundException("cet item n'existe pas"));
					
					
				  //i- vérifie si item pas dispo
					if(itemFound.getExemplaires() == 0) {
						throw new ItemsNotAvailableException("cet item n'est pas disponible");
					}
							
				itemsDuPanier.add(itemFound);

			}			


			//b- if < 3 : nbItemsEmpruntés + nbEmpruntsPanier <= 3 : add Items à empruntListe de cet utilisateur
			//a- on récupère la liste des items empruntés par l'utilisateur
			List<Emprunt> empruntsUtilisateur = empruntRepository.findEmpruntById(utilisateurFound);

			//b- if EmpruntsUtilisateur.size() + itemsDuPaniers.size() > 3 : throw EmpruntLimitReachedException
			if (empruntsUtilisateur.size() + itemsDuPanier.size() > 3 ) {
				throw new EmpruntLimitReachedException("vous ne pouvez pas emprunter plus de 3 items");
			}
			
			//i- décrémentation du nombreExemplaires dans la table ITEMS
			//NB: mettre truc.get().get/set quand le type est Optional
			for (Long idItem: items) {
				Optional<Items> itemEmpruntes = itemsRepository.findById(idItem);
				itemEmpruntes.get().setExemplaires(itemEmpruntes.get().getExemplaires()-1);
			}

			//c- sinon 
			//i- add la liste des itemsDuPanier dans la table EMPRUNTS associé à l'id utilisateur + date de retour null (signifie que l'emprunt est en cours)

			//Créer un emprunt en positionnant la date
			Emprunt empruntEnCours = new Emprunt();
			empruntEnCours.setDate_emprunt(LocalDateTime.now());
			empruntEnCours.setItems(itemsDuPanier);
			empruntEnCours.setUser(utilisateurFound);

			empruntRepository.save(empruntEnCours);

			return empruntEnCours;


			//Rendre un emprunt

			//Vérifier le délai de 7j


	}





}
}
