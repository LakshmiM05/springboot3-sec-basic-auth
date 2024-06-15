package com.example.sec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sec.entity.MyUser;

@Repository
public interface MyRepository extends JpaRepository<MyUser, Long> {
	
	MyUser findByUserName(String userName);

}
