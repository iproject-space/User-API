package com.projectspace.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectspace.users.entities.User;
import com.projectspace.users.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository repository;

	@Override
	public User createUser(User user) {

		try {
			return repository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
