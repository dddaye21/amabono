package com.intensive.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intensive.sk.entity.Member;
import com.intensive.sk.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public void createMember(Member member) {
		
		memberRepository.save(member);
		
	}
	
	
}
