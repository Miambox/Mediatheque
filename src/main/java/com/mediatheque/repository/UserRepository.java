package com.mediatheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatheque.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
