package com.flav.movie.context.movie.infrastructure.controllers;

import com.flav.movie.context.movie.aplication.FindOneMovieUseCase;
import com.flav.movie.context.movie.domain.models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class FindOneMovieController {
    private final FindOneMovieUseCase findOneMovieUseCase;

    public FindOneMovieController(FindOneMovieUseCase findOneMovieUseCase) {
        this.findOneMovieUseCase = findOneMovieUseCase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findOne(@PathVariable Long id) {
        return this.findOneMovieUseCase.run(id).map(movie -> new ResponseEntity<>(movie, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
