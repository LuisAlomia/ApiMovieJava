package com.flav.movie.context.movie.aplication;

import com.flav.movie.context.movie.domain.models.Movie;
import com.flav.movie.context.movie.domain.repository.MovieRepository;

import java.util.List;

public class ListMoviesUseCase {

    private final MovieRepository _movieRepository;

    public ListMoviesUseCase(MovieRepository movieRepository){
        this._movieRepository = movieRepository;
    }
    public List<Movie> run() {
        return this._movieRepository.list();
    }
}
