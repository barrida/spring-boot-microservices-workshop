package io.javabrains.moviecatalogservice.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
@Getter
@Setter
@Builder
public class UserRating {
    private String userId;
    private List<Rating> ratings;
}
