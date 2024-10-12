package com.videoGames.videoGame.infrastucture.modelo;

import com.videoGames.videoGame.domain.modelo.VideoGame;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


import java.time.LocalDateTime;
@Data
@RequiredArgsConstructor
public class VideoGameController {
    private int id;
    private String slug;
    private String name;
    private String released;
    private double rating;

    public VideoGameController(int id, String slug, String name, String released, double rating) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.released = released;
        this.rating = rating;
    }


    public static VideoGameController videoGameToVideoGameController(VideoGame videoGame){
        return new VideoGameController(
                videoGame.getId(),
                videoGame.getSlug(),
                videoGame.getName(),
                videoGame.getReleased(),
                videoGame.getRating()
        );
    }
}
