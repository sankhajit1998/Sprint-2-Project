package com.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
