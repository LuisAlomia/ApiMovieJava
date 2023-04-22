package com.flav.movie.context.movie.infrastructure.controllers;

import com.flav.movie.context.movie.aplication.CreateMovieUseCase;
import com.flav.movie.context.movie.aplication.ListMoviesUseCase;
import com.flav.movie.context.movie.domain.models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class ListMoviesController {
    private final ListMoviesUseCase listMoviesUseCase;

    public ListMoviesController(ListMoviesUseCase listMoviesUseCase) {
        this.listMoviesUseCase = listMoviesUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> list(){
        List<Movie> movies = this.listMoviesUseCase.run();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }
}
