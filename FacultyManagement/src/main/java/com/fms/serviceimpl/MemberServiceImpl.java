package com.fms.serviceimpl;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.entity.Member;
import com.fms.exception.MemberNotFoundException;
import com.fms.repository.MemberRepository;
import com.fms.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository memberRepository;

	// save the member details
	@Override
	public Member saveMember(Member member) {

		return memberRepository.save(member);
	}

	// get all the member details
	@Override
	public List<Member> getAllMembers() {

		return memberRepository.findAll();

	}

	// fetching member details based on id using findById, if not found throw
	// exception
	// & fetch any data of member
	@Override
	public Member getMemberById(int id) {

		return memberRepository.findById(id).orElseThrow(() -> new MemberNotFoundException("No member exist in table"));
	}

	// fetching member details based on id using findById, if not found throw
	// exception
	// & update any data of member
	@Override
	public Member updateMemberById(Member member, int id) {

		Member newmember = memberRepository.findById(id)
				.orElseThrow(() -> new MemberNotFoundException("No member exist in table"));

		// updated value
		newmember.setEmail(member.getEmail());
		newmember.setPhone(member.getPhone());
		memberRepository.save(newmember);
		return newmember;

	}

	// fetching member details based on id using findById, if not found throw
	// exception
	// & delete any data of member
	@Override
	public void deleteMemberById(int id) {

		memberRepository.findById(id).orElseThrow(() -> new MemberNotFoundException("No user exist in table"));
		memberRepository.deleteById(id);

	}

//	@Override
//	public List<Member> getFname(String fname) {
//		return memberRepository.getFname(fname);
//	}
//
//	@Override
//	public List<Member> getLname(String lname) {
//		return memberRepository.getLname(lname);
//	}
//
//	@Override
//	public Member getPhone(long phone) {
//		return memberRepository.getPhone(phone);
//	}

}
