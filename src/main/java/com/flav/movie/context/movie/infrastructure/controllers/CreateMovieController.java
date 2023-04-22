package com.flav.movie.context.movie.infrastructure.controllers;

import com.flav.movie.context.movie.aplication.CreateMovieUseCase;
import com.flav.movie.context.movie.domain.models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class CreateMovieController {

    private final CreateMovieUseCase createMovieUseCase;

    public CreateMovieController(CreateMovieUseCase createMovieUseCase) {
        this.createMovieUseCase = createMovieUseCase;
    }

    @PostMapping
    public ResponseEntity<Movie> create(@RequestBody Movie movie){
        Movie saveMovie = this.createMovieUseCase.run(movie);
        return new ResponseEntity<>(saveMovie, HttpStatus.CREATED);
    }
}
