package com.projectspace.users.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.projectspace.users.entities.User;
import com.projectspace.users.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository repository;

	@Override
	public ResponseEntity<Object> createUser(User user) {

		try {
			return new ResponseEntity<>(repository.save(user), HttpStatus.CREATED);
		} catch (DataIntegrityViolationException e) {
			Map<String, String> response = new HashMap<>();
			response.put("email", user.getEmail() + " already exists");
			return new ResponseEntity<>(response,
					HttpStatus.BAD_REQUEST);
		}
	}
}
