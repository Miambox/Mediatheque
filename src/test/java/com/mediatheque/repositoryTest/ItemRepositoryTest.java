package com.mediatheque.repositoryTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.mediatheque.repository.ItemsRepository;
import com.mediatheque.entity.Items;



@DataJpaTest
public class ItemRepositoryTest {

	@Autowired
	ItemsRepository itemsRepository;

	@Test
	void testisDisponible() {
		int exemplaires =0;
		List<Items> response = itemsRepository.isDisponible();
		for(Items i : response) {
			if (i.getExemplaires()>0) {
				exemplaires+=1;
			}
		}
		System.out.println("Nombre d'items disponibles : " + exemplaires);
		assertEquals(exemplaires, itemsRepository.isDisponible().size());
	}

	@Test
	public void testFindCD() {
		List<Items> response = itemsRepository.findAllCD();
		System.out.println("Nombre de CD : " + response);
		assertEquals(3, response.size());
	}
	
	@Test
	public void testFindDvd() {
		List<Items> response = itemsRepository.findAllDvd();
		System.out.println("Nombre de Dvd : " + response);
		assertEquals(3, response.size());
	}
	
	@Test
	public void testFindLivres() {
		List<Items> response = itemsRepository.findAllLivres();
		System.out.println("Nombre de Livres : " + response);
		assertEquals(3, response.size());
	}


}

