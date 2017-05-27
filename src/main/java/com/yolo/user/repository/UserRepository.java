package com.yolo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yolo.user.domain.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	User findByUserId(String userId);
}
