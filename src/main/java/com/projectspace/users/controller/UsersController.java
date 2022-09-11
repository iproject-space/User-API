package com.projectspace.users.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspace.users.entities.User;
import com.projectspace.users.service.UsersService;

@RestController
@RequestMapping("/api/v1")
@Validated
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@PostMapping(path = "/user")
	public ResponseEntity<?> createUser(@Valid @RequestBody User user){
		return service.createUser(user);
	}
}
