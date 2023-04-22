package com.flav.movie.context.movie.domain.repository;

import com.flav.movie.context.movie.domain.models.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {
     Movie create(Movie movie);
     List<Movie> list();
     Optional<Movie> findOne(long id);
     Optional<Movie> update(long id, Movie movie);
     boolean delete(long id);
}
