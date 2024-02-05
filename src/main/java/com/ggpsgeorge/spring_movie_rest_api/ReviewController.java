package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    
    @Autowired
    ReviewService reviewService;

    @GetMapping("/all")
    public ResponseEntity<List<Review>> getAllReviews(){
        return new ResponseEntity<List<Review>>(reviewService.findAllReviews(), null, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Review>> findReview(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Review>>(reviewService.findReviewById(id), null, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Review> saveReview(@RequestBody Review review){
        return new ResponseEntity<Review>(reviewService.addReview(review), null, HttpStatus.CREATED);
    }

}
