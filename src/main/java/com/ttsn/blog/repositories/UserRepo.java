package com.ttsn.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttsn.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	
}
