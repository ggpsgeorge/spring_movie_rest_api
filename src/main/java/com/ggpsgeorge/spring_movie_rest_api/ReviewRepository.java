package com.ggpsgeorge.spring_movie_rest_api;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId>{
    
}
