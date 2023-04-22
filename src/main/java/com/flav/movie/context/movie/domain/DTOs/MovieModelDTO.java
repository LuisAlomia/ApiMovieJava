package com.flav.movie.context.movie.domain.DTOs;

import com.flav.movie.context.movie.domain.models.Movie;

import java.util.Date;

public class MovieModelDTO {
    private long id;
    private String title;
    private String linkVideo;
    private String linkImage;
    private String description;
    private Date date;
    private String actors;
    private String director;

    public Movie model() {
        return new Movie(this.id, this.title, this.linkVideo, this.linkImage, this.description, this.date, this.actors, this.director);
    }
}
