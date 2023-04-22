package com.flav.movie.context.movie.aplication;

import com.flav.movie.context.movie.domain.models.Movie;
import com.flav.movie.context.movie.domain.repository.MovieRepository;

import java.util.Optional;

public class UpdateMovieUseCase {

    private final MovieRepository _movieRepository;

    public UpdateMovieUseCase(MovieRepository movieRepository){
        this._movieRepository = movieRepository;
    }

    public Optional<Movie> run(long id, Movie movie) {
        return this._movieRepository.update(id, movie);
    }
}
