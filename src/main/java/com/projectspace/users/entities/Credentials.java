package com.projectspace.users.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credentials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String username;
	
	private String password;
	
	@OneToOne(mappedBy = "credentials")
	private User user;

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
