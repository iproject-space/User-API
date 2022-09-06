package com.projectspace.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectspace.users.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

}
