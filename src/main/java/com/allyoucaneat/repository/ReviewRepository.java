package com.allyoucaneat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allyoucaneat.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
