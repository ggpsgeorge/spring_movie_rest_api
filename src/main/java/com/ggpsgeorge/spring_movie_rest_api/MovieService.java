package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    
    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> findById(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> findByImdbId(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public String deleteMovie(ObjectId id){
        Movie existingMovie = findById(id).get();
        movieRepository.deleteById(id);
        return "The movie " + existingMovie.getTitle() + "(" + existingMovie.id.toString() + ")" + " was deleted!";
    }

    public String deleteMovieByImdbId(String imdbid){
        Movie existingMovie = findByImdbId(imdbid).get();
        movieRepository.deleteByImdbId(imdbid);
        return "The movie " + existingMovie.getTitle() + "(" + existingMovie.id.toString() + ")" + " was deleted!";

    }

    public Movie updateMovie(Movie movie){
        Movie existingMovie = findByImdbId(movie.getImdbId()).get();
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setReleaseDate(movie.getReleaseDate());
        existingMovie.setTrailerLink(movie.getTrailerLink());
        existingMovie.setGenres(movie.getGenres());
        existingMovie.setBackdrops(movie.getBackdrops());
        existingMovie.setPoster(movie.getPoster());
        existingMovie.setReviewIds(movie.getReviewIds());
        
        return movieRepository.save(existingMovie);
    }
}
