package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    
    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public String hello(){
        return "Oi, eu sou o goku";
    }

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.findAllMovies(), null ,HttpStatus.OK);
    }

}
