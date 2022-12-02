package com.fms.service;

import java.util.List;

import com.fms.entity.Department;

public interface DepartmentService {

	// saving details of Member entity
	Department saveDepartment(Department department);
	
	// getting all details of Member
	List<Department> getAllDepartment();
	
	// getting details of Member based on id
	Department getDepartmentById(int did);
	
	// getting details of Member based of id & update mentioned details
	Department updateDepartmentById(Department department, int did);
	
	// getting details of Member based of id & delete mentioned details
	void deleteDepartmentById(int did);
}
