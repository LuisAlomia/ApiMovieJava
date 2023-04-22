package com.flav.movie.context.movie.infrastructure.repositoryImpl;

import com.flav.movie.context.movie.infrastructure.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMovieRepository extends JpaRepository<MovieEntity, Long> {
}
