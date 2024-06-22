package com.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
