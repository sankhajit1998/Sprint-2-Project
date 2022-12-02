package com.fms.entity;

import java.util.List;

import javax.persistence.CascadeType;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department { // entity class

	// taking entities for department

	@Id
	private int did;

	@Column(length = 20, nullable = false)
	@NotBlank(message = "Please enter department name")
	private String dname;

	@Column(length = 20, nullable = false)
	@NotBlank(message = "Please enter department head name")
	private String dhead;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "department", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Member> member;

}
