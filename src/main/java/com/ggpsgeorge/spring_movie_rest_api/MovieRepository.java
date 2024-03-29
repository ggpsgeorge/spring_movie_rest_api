package com.ggpsgeorge.spring_movie_rest_api;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
    Optional<Movie> findByImdbId(String imdbId);
    String deleteByImdbId(String imdbId);
}
