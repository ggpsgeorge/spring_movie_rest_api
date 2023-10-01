package com.ggpsgeorge.spring_movie_rest_api;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    protected ObjectId id;
    // TODO: Create a user class that can have many reviews
    private String review_body;
}
