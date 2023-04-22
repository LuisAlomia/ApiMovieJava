package com.flav.movie.context.movie.aplication;

import com.flav.movie.context.movie.domain.models.Movie;
import com.flav.movie.context.movie.domain.repository.MovieRepository;

public class CreateMovieUseCase  {
    private final MovieRepository _movieRepository;

    public CreateMovieUseCase(MovieRepository movieRepository){
        this._movieRepository = movieRepository;
    }
    public Movie run(Movie movie) {
        return this._movieRepository.create(movie);
    }
}
