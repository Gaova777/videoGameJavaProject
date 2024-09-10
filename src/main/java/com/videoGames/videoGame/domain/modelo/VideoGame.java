package com.videoGames.videoGame.domain.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@RequiredArgsConstructor
//@NoArgsConstructor
    public class VideoGame {
    private int id;
    private String slug;
    private String name;
    private LocalDateTime released;
    private double rating;


    public VideoGame(int id, String slug, String name, LocalDateTime released, double rating) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.released = released;
        this.rating = rating;
    }


}
