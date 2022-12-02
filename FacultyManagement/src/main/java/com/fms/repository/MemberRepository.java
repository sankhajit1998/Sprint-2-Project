package com.fms.repository;

import java.util.List;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fms.entity.Member;

// member repository extending JpaRepository 
public interface MemberRepository extends JpaRepository<Member, Integer> {
	
//	@Query("select member from Member member where member.fname = ?1")
//	List<Member> getFname(String fname);
//	
//	@Query("select member from Member member where member.lname = ?1")
//	List<Member> getLname(String lname);
//	
//	@Query("select member from Member member where member.fname = ?1")
//	Member getPhone(long phone);

}
