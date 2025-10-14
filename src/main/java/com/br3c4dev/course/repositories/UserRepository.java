package com.br3c4dev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br3c4dev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	}
