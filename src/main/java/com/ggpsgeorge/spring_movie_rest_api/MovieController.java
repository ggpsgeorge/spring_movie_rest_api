package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return new ResponseEntity<List<Movie>>(movieService.findAllMovies(), null , HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Movie>>(movieService.findById(id), null, HttpStatus.OK);
    }

    @GetMapping("/imdb/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.findByImdbId(imdbId), null, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.saveMovie(movie), null, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> eraseMovie(@PathVariable ObjectId id){
        return new ResponseEntity<String>(movieService.deleteMovie(id), null, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/imdb/delete/{imdbId}")
    public ResponseEntity<String> eraseMovieByImdbId(@PathVariable String imdbId){
        return new ResponseEntity<String>(movieService.deleteMovieByImdbId(imdbId), null, HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Movie> modifyMovie(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.updateMovie(movie), null, HttpStatus.OK);
    }

}
