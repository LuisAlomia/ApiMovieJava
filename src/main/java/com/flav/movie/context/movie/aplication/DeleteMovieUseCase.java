package com.flav.movie.context.movie.aplication;

import com.flav.movie.context.movie.domain.models.Movie;
import com.flav.movie.context.movie.domain.repository.MovieRepository;

import java.util.Optional;

public class DeleteMovieUseCase {

    private final MovieRepository _movieRepository;

    public DeleteMovieUseCase(MovieRepository movieRepository){
        this._movieRepository = movieRepository;
    }

    public boolean run(long id) {
        return this._movieRepository.delete(id);
    }
}
