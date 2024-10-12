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
    private String released;
    private double rating;
    private String background_image;

    public VideoGame(int id, String slug, String name, String released, double rating,String background_image) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.released = released;
        this.rating = rating;
        this.background_image=background_image;
    }


}
