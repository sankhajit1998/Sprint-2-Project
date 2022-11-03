package com.fms.entity;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {   // entity class

	// taking entities for faculty members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 15, nullable = false)
	@NotBlank(message = "please enter first name")
	private String fname;
	
	@Column(length = 15, nullable = false)
	@NotBlank(message = "please enter last name")
	private String lname;
	
	@Column(length = 20, nullable = false)
	@NotBlank(message = "please enter first name")
	private String address;
	
	@Column(length = 3, nullable = false)
	@NotNull(message = "please enter first name")
	private int age;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message = "please enter first name")
	private long phone;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "please enter first name")
	private String email;
	
}
