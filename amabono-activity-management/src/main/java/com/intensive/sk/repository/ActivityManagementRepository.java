package com.intensive.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensive.sk.entity.ActivityManagement;
import com.intensive.sk.entity.Status;

public interface ActivityManagementRepository extends JpaRepository<ActivityManagement, Integer> {

	ActivityManagement findById(int id);
}
