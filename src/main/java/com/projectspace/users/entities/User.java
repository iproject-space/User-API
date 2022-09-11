package com.projectspace.users.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotEmpty
	private String firstname;

	@NotEmpty
	private String lastname;

	@Column(unique = true)
	@Email(message = "Email Address is invalid.")
	@NotEmpty
	private String email;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Size(min = 8, max = 20, message = "Password length must be in between 8 to 20")
	private String password;
	
	@NotEmpty
	private String country;

	@Size(min = 10, max = 10, message = "Mobile Number must be 10 digtis without country code")
	private String mobileNumber;

	@NotEmpty
	private String occupation;

}
