package com.projectspace.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.projectspace.users.entities.Error;
import com.projectspace.users.entities.User;
import com.projectspace.users.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository repository;

	@Override
	public ResponseEntity<Object> createUser(User user){

			try {
				User createdUser = repository.save(user);
				return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(new Error("Please check the details and enter valid details"),HttpStatus.BAD_REQUEST);
			}
		}
	}


