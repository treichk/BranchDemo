package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserDataService;

import dto.UserDataUser;
import jakarta.validation.constraints.Pattern;

@RestController
public class UserDataController {

	@Autowired
	UserDataService service;
	
	private Logger logger = LoggerFactory.getLogger(UserDataController.class);
	
	@Cacheable("users")
	@GetMapping("/users/{username}")
	public UserDataUser getUserDataUser(@PathVariable  @Pattern(regexp = "^[a-zA-Z0-9-]+$") String username) {
		logger.debug("Call to users: " + username);
		return service.getUserData(username);
	}
}
