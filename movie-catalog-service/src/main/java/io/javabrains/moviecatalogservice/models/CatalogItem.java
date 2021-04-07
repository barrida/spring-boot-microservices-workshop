package io.javabrains.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class CatalogItem {
    private String name;
    private String desc;
    private int rating;
}
