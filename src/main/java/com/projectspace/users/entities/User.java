package com.projectspace.users.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "credentials_id", referencedColumnName = "id")
	private Credentials credentials;
	
}
