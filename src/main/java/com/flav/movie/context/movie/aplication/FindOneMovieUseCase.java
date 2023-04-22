package com.flav.movie.context.movie.aplication;

import com.flav.movie.context.movie.domain.models.Movie;
import com.flav.movie.context.movie.domain.repository.MovieRepository;

import java.util.Optional;

public class FindOneMovieUseCase {
    private final MovieRepository _movieRepository;

    public FindOneMovieUseCase(MovieRepository movieRepository){
        this._movieRepository = movieRepository;
    }

    public Optional<Movie> run(long id) {
        return this._movieRepository.findOne(id);
    }
}
