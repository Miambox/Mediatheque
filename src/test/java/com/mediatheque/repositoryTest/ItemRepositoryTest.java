package com.mediatheque.repositoryTest;

import java.util.Calendar;
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

	//Test par date
//	@Test
//	void testFindByDateParution() {
//		Calendar cal = Calendar.getInstance();
//		cal.set(2017, 04, 22);
//		List<Items> response = itemsRepository.findAllItemsByDateParution();
//		System.out.println("Nombre de nouveautés : " + response);
//		assertEquals(4, response.size());
//	}

	@Test
	public void testFindItemsByNbExemplaires() {
		List<Items> response = itemsRepository.FindAllItemsByNbExemplaires();
		System.out.println("Nombre d'items ayant au moins un exemplaire : " + response);
		assertEquals(8, response.size());
	}

	// Tests sur les items + CD/DVD/LIVRES
	@Test
	public void testFindAllItems() {
		List<Items> response = itemsRepository.findAllItems();
		System.out.println("Nombre d'items : " + response);
		assertEquals(9, response.size());
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

