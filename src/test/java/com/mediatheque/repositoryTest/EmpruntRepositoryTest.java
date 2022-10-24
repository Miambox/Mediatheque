//package com.mediatheque.repositoryTest;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import com.mediatheque.entity.Emprunt;
//import com.mediatheque.entity.User;
//import com.mediatheque.repository.EmpruntRepository;
//
//@DataJpaTest
//
//public class EmpruntRepositoryTest {
//	@Autowired
//	EmpruntRepository empruntRepository;
//	
//	@Test
//	public void findEmpruntByUser() {
//	User user = new User();
//	user.setId(2l);
//	
//	List<Emprunt> findResult = empruntRepository.findEmpruntById(user);
//	System.out.println("Les emprunts de cet user sont" + findResult);
//	assertTrue(findResult.size() > 0);
//	
//	}
//
//}
