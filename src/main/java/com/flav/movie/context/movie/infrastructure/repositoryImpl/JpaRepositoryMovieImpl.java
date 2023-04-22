package com.flav.movie.context.movie.infrastructure.repositoryImpl;

import com.flav.movie.context.movie.domain.models.Movie;
import com.flav.movie.context.movie.domain.repository.MovieRepository;
import com.flav.movie.context.movie.infrastructure.entities.MovieEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaRepositoryMovieImpl implements MovieRepository {

    private final JpaMovieRepository _jpaRepositoryMovie;

    public JpaRepositoryMovieImpl(JpaMovieRepository jpaMovieRepository) {
        this._jpaRepositoryMovie = jpaMovieRepository;
    }

    @Override
    public Movie create(Movie movie) {
        MovieEntity newMovie = MovieEntity.newMovie(movie);
        MovieEntity saveMovie = this._jpaRepositoryMovie.save(newMovie);
        return saveMovie.toMovieModel();
    }

    @Override
    public List<Movie> list() {
        return this._jpaRepositoryMovie.findAll().stream().map(MovieEntity::toMovieModel).collect(Collectors.toList());
    }

    @Override
    public Optional<Movie> findOne(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Movie> update(long id, Movie movie) {
        return Optional.empty();
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}

