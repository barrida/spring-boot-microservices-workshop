package io.javabrains.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieSummary {
    private String id;
    private String title;
    private String overview;
}
