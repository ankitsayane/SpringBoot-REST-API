package com.auto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.ResourceAccessException;

import com.auto.entities.User;
import com.auto.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User getUserById(Long uid) {
		return userRepo.findById(uid).orElseThrow(()->new ResourceAccessException("Id Not Found"));
	}
}
