package com.intensive.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Member;

@RestController
public class MemberController {
	
	@PostMapping("/createMember")
	public void createMember(Member member) {
		
	}
	
	@PostMapping("/deleteMember")
	public void deleteMember() {
		
	}
	
	@PostMapping("/login")
	public void login(String loginId, String password) {
		
	}
	
	@GetMapping("/member")
	public Member member(Member member) {
		
		Member result = new Member();
		
		return result;
	}
	
	@PostMapping("/memberInfoChange")
	public Member memberInfoChange(Member member) {
		Member result = new Member();
		
		return result;
	}
	
	@GetMapping("/allMembers")
	public List<Member> members(){
		List<Member> results = new ArrayList<>();
		
		return results;
	}
}
