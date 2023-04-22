package com.flav.movie.context.movie.infrastructure.config;

import com.flav.movie.context.movie.aplication.CreateMovieUseCase;
import com.flav.movie.context.movie.aplication.ListMoviesUseCase;
import com.flav.movie.context.movie.domain.repository.MovieRepository;
import com.flav.movie.context.movie.infrastructure.repositoryImpl.JpaRepositoryMovieImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CreateMovieUseCase createMovieUseCase(MovieRepository movieRepository){
        return new CreateMovieUseCase(movieRepository);
    }

    @Bean
    public ListMoviesUseCase listMoviesUseCase(MovieRepository movieRepository){
        return new ListMoviesUseCase(movieRepository);
    }

    @Bean
    public MovieRepository movieRepository(JpaRepositoryMovieImpl jpaRepositoryMovieImpl) {
        return jpaRepositoryMovieImpl;
    }
}
