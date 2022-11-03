package com.fms.service;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

import java.util.List;

import com.fms.entity.Member;

public interface MemberService {

	// saving details of Member entity
	Member saveMember(Member member);
	
	// getting all details of Member
	List<Member> getAllMembers();
	
	// getting details of Member based on id
	Member getMemberById(int id);
	
	// getting details of Member based of id & update mentioned details
	Member updateMemberById(Member member, int id);
	
	// getting details of Member based of id & delete mentioned details
	void deleteMemberById(int uid);
	
}
