package com.fms.entity.controller;

/*
 * @author Sankhajit Roy
 * @Sprint 2 project
 */

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

import com.fms.entity.Member;
import com.fms.service.MemberService;

// member controller to handling all rest api incoming request
@RestController
public class MemberController {

	@Autowired
	private MemberService ms;

	// save Member in DB table using rest API PostMapping
	@PostMapping("/save-member")
	public ResponseEntity<Member> saveMember(@Valid @RequestBody Member member) {

		return new ResponseEntity<Member>(ms.saveMember(member), HttpStatus.CREATED);

	}

	// fetch all Member from DB table using rest API GetMapping
	@GetMapping("/get-all")
	public List<Member> getAll() {

		return ms.getAllMembers();

	}

	// fetch Member from DB table using rest API GetMapping based on id
	@GetMapping("/get-member/{id}")
	public ResponseEntity<Member> getMember(@PathVariable("id") int id) {

		return new ResponseEntity<Member>(ms.getMemberById(id), HttpStatus.OK);

	}

	// update Member in DB table using rest API PostMapping
	@PutMapping("/update-member/{id}")
	public ResponseEntity<Member> updateMember(@PathVariable("id") int id, @RequestBody Member member) {

		return new ResponseEntity<Member>(ms.updateMemberById(member, id), HttpStatus.OK);

	}

	// delete Member in DB table using rest API PostMapping
	@DeleteMapping("/delete-member/{id}")
	public ResponseEntity<String> deleteMember(@PathVariable("id") int id) {
		ms.deleteMemberById(id);
		return new ResponseEntity<String>("Delete user succesfully", HttpStatus.OK);
	}

}
