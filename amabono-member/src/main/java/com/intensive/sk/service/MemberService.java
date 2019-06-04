package com.intensive.sk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intensive.sk.entity.Member;
import com.intensive.sk.entity.MemberType;
import com.intensive.sk.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public void createMember(Member member) {
		
		memberRepository.save(member);
		
	}
	
	public Member getMemberById(int id) {
		
		Member member = memberRepository.getOne(id);
		
		
		return member;
	}
	
	public void deleteMember(Member member) {
		Member target = this.getMemberById(member.getId());
		
		memberRepository.delete(target);
		
	}
	
	
	public void modifyMember(Member member) {
		Member target = this.getMemberById(member.getId());
		
		target.setInterests(member.getInterests());
		target.setLocation(member.getLocation());
		target.setMajor(member.getMajor());
		target.setPassword(member.getPassword());
		
		
		memberRepository.save(target);
		
		
	}
	
	public List<Member> getAllMember(){
		return memberRepository.findAll();
	}
	
	
}
