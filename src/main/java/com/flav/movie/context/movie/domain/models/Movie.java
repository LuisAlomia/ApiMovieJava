package com.flav.movie.context.movie.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class Movie {
    private long id;
    private String title;
    private String linkVideo;
    private String linkImage;
    private String description;
    private Date date;
    private String actors;
    private String director;

    public Movie(long id, String title, String linkVideo, String linkImage, String description, Date date, String actors, String director) {
        this.id = id;
        this.title = title;
        this.linkVideo = linkVideo;
        this.linkImage = linkImage;
        this.description = description;
        this.date = date;
        this.actors = actors;
        this.director = director;
    }

}
