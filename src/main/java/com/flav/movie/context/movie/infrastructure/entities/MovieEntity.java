package com.flav.movie.context.movie.infrastructure.entities;

import com.flav.movie.context.movie.domain.models.Movie;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String linkVideo;
    private String linkImage;
    private String description;
    private Date date;
    private String actors;
    private String director;

    public MovieEntity(long id, String title, String linkVideo, String linkImage, String description, Date date, String actors, String director) {
        this.id = id;
        this.title = title;
        this.linkVideo = linkVideo;
        this.linkImage = linkImage;
        this.description = description;
        this.date = date;
        this.actors = actors;
        this.director = director;
    }

    public static MovieEntity newMovie(Movie movie ){
        return new MovieEntity(
                movie.getId(),
                movie.getTitle(),
                movie.getLinkVideo(),
                movie.getLinkImage(),
                movie.getDescription(),
                movie.getDate(),
                movie.getActors(),
                movie.getDirector());
    }

    public Movie toMovieModel(){
        return new Movie(this.id, this.title, this.linkVideo, this.linkImage, this.description, this.date, this.actors, this.director);
    }
}
