package com.flav.movie.context.movie.infrastructure.controllers;

import com.flav.movie.context.movie.aplication.DeleteMovieUseCase;
import com.flav.movie.context.movie.aplication.FindOneMovieUseCase;
import com.flav.movie.context.movie.domain.models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class DeleteMovieController {

    private final DeleteMovieUseCase deleteMovieUseCase;

    public DeleteMovieController(DeleteMovieUseCase deleteMovieUseCase) {
        this.deleteMovieUseCase = deleteMovieUseCase;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (this.deleteMovieUseCase.run(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
