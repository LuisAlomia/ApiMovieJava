package com.flav.movie.context.movie.infrastructure.controllers;

import com.flav.movie.context.movie.aplication.UpdateMovieUseCase;
import com.flav.movie.context.movie.domain.models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class UpdateMovieController {

    private final UpdateMovieUseCase updateMovieUseCase;

    public UpdateMovieController(UpdateMovieUseCase updateMovieUseCase) {
        this.updateMovieUseCase = updateMovieUseCase;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> update(@PathVariable Long id, @RequestBody Movie data) {
        return this.updateMovieUseCase.run(id, data).map(movie -> new ResponseEntity<>(movie, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
