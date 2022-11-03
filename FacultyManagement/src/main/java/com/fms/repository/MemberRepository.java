package com.fms.repository;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.entity.Member;

// member repository extending JpaRepository 
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
