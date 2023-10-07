package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    
    @Autowired
    ReviewRepository reviewRepository;

    public Review addReview(Review review){
        return reviewRepository.save(review);
    }

    public List<Review> findAllReviews(){
        return reviewRepository.findAll();
    }

    public Optional<Review> findReviewById(ObjectId id){
        return reviewRepository.findById(id);
    }

}
