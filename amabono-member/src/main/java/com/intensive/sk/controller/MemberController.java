package com.intensive.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensive.sk.entity.Member;
import com.intensive.sk.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/createMember")
	public void createMember(Member member) {
		
		memberService.createMember(member);
		
	}
	
	@PostMapping("/deleteMember")
	public void deleteMember(Member member) {
		
		memberService.deleteMember(member);
	}
	
	@PostMapping("/login")
	public void login(String loginId, String password) {
		
	}
	
	@GetMapping("/member")
	public Member member(int id) {
		
		Member result = memberService.getMemberById(id);
		
		
		return result;
	}
	
	@PostMapping("/memberInfoChange")
	public Member memberInfoChange(Member member) {
		memberService.modifyMember(member);
		Member result = memberService.getMemberById(member.getId());
		return result;
	}
	
	@GetMapping("/allMembers")
	public List<Member> members(){
		List<Member> results = memberService.getAllMember();
		
		return results;
	}
}
