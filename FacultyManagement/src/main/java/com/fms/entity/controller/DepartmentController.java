package com.fms.entity.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fms.entity.Department;
import com.fms.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService ds;

	// save Member in DB table using rest API PostMapping
	@PostMapping("/save-dept")
	public ResponseEntity<Department> saveDepartment(@Valid @RequestBody Department department) {

		return new ResponseEntity<Department>(ds.saveDepartment(department), HttpStatus.CREATED);

	}

	// fetch all Member from DB table using rest API GetMapping
	@GetMapping("/get-allDept")
	public List<Department> getAll() {

		return ds.getAllDepartment();

	}

	// fetch Member from DB table using rest API GetMapping based on id
	@GetMapping("/get-dept/{did}")
	public ResponseEntity<Department> getDepartment(@PathVariable("did") int did) {

		return new ResponseEntity<Department>(ds.getDepartmentById(did), HttpStatus.OK);

	}

	// update Member in DB table using rest API PostMapping
	@PutMapping("/update-dept/{did}")
	public ResponseEntity<Department> updateDepartment(@PathVariable("did") int did,
			@RequestBody Department department) {

		return new ResponseEntity<Department>(ds.updateDepartmentById(department, did), HttpStatus.OK);

	}

	// delete Member in DB table using rest API PostMapping
	@DeleteMapping("/delete-dept/{did}")
	public ResponseEntity<String> deleteDepartment(@PathVariable("did") int did) {
		ds.deleteDepartmentById(did);
		return new ResponseEntity<String>("Delete department succesfully", HttpStatus.OK);
	}

}
