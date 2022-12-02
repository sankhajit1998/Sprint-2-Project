package com.fms.entity;


import javax.persistence.CascadeType;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "did", referencedColumnName = "did")
	@JsonBackReference
	private Department department;
	
}
