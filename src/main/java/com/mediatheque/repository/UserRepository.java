package com.mediatheque.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mediatheque.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//	Trouver un user pour un login
	Optional<User> findByEmail(String email);
}
