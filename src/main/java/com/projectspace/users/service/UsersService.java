package com.projectspace.users.service;

import org.springframework.http.ResponseEntity;

import com.projectspace.users.entities.User;

public interface UsersService {

	public ResponseEntity<Object> createUser(User user);
}
