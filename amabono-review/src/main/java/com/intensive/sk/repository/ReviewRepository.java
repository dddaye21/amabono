package com.intensive.sk.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.intensive.sk.entity.Review;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
	
	Review findById(long id);

}
