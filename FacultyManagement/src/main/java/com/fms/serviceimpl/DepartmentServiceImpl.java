package com.fms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.entity.Department;
import com.fms.exception.MemberNotFoundException;
import com.fms.repository.DepartmentRepository;
import com.fms.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository deptRepo;

	// save the department details
	@Override
	public Department saveDepartment(Department department) {
		
		return deptRepo.save(department);
	}

	// get all the department details
	@Override
	public List<Department> getAllDepartment() {

		return deptRepo.findAll();
	}

	// fetching department details based on id using findById, if not found throw exception
	// & fetch any data of department
	@Override
	public Department getDepartmentById(int did) {

		return deptRepo.findById(did).orElseThrow(() -> new MemberNotFoundException("No department member exist in table"));
		
	}

	// fetching department details based on id using findById, if not found throw exception
	// & update any data of department
	@Override
	public Department updateDepartmentById(Department department, int did) {

		Department newdept = deptRepo.findById(did)
				.orElseThrow(() -> new MemberNotFoundException("No department member exist in table"));

		// updated value
		newdept.setDhead(department.getDhead());
		deptRepo.save(newdept);
		return newdept;
		
	}

	// fetching department details based on id using findById, if not found throw exception
	// & delete any data of department
	@Override
	public void deleteDepartmentById(int did) {

		deptRepo.findById(did).orElseThrow(() -> new MemberNotFoundException("No user exist in table"));
		deptRepo.deleteById(did);
		
	}

}
