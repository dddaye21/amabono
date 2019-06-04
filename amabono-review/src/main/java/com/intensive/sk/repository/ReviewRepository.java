package com.intensive.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.intensive.sk.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
