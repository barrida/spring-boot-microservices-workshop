package io.javabrains.moviecatalogservice.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Rating {
    private String movieId;
    private int rating;
}
