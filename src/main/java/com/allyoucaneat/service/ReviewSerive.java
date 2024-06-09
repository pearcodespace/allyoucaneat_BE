package com.allyoucaneat.service;

import java.util.List;

import com.allyoucaneat.Exception.ReviewException;
import com.allyoucaneat.model.Review;
import com.allyoucaneat.model.User;
import com.allyoucaneat.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
