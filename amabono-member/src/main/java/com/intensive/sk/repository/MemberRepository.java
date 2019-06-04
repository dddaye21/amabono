package com.intensive.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensive.sk.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}
