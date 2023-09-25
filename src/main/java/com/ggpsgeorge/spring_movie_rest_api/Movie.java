package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    protected UUID id;

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    // TODO: Create a img class that can be a poster
    private String poster; 
    // TODO: Create a img class that is a backdrop, 
    // and a movie can have many backdrops
    private List<String> backdrops; 
    private List<UUID> reviewIds;
}
