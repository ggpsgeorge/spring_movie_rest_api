package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    
    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }

}
