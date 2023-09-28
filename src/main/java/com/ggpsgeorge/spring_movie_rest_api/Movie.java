package com.ggpsgeorge.spring_movie_rest_api;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    protected ObjectId id;

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
    
    // TODO: Make reference to reviewIds that are type uuid
    // @DocumentReference
    private List<String> reviewIds;
}
