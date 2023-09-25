package com.ggpsgeorge.spring_movie_rest_api;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    protected UUID id;
    // TODO: Create a user class that can have many reviews
    private String review_body;
}
