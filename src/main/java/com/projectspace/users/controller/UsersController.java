package com.projectspace.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspace.users.entities.Error;
import com.projectspace.users.entities.User;
import com.projectspace.users.service.UsersService;

@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@PostMapping(path = "/")
	public ResponseEntity<?> createUser(@RequestBody User user){
		
		try {
			return service.createUser(user);
//			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (IllegalArgumentException e) {
			Error error = new Error(e.getLocalizedMessage());
			return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
		}
	}
}
