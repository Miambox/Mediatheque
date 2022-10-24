package com.mediatheque.repositoryTest;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mediatheque.entity.User;
import com.mediatheque.repository.UserRepository;

@DataJpaTest
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository; 

	@Test
	public void should_find_user_by_email() {
		Optional<User> findUser = userRepository.findByEmail("mia@gmail.com");
		assertEquals("mia", findUser.get().getNom());
	}


}
