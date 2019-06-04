package com.intensive.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensive.sk.entity.ActivityManagement;

public interface ActivityManagementRepository extends JpaRepository<ActivityManagement, Integer> {

}
