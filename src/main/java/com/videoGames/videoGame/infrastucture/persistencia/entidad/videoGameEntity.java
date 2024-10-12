package com.videoGames.videoGame.infrastucture.persistencia.entidad;

import com.videoGames.videoGame.domain.modelo.VideoGame;
import com.videoGames.videoGame.infrastucture.modelo.VideoGameController;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity()
@Table(name = "VideoGame")
public class videoGameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String slug;
    private String name;
    private String released;
    private double rating;


    public static videoGameEntity videoGameModeloToVideoGameEntity(VideoGame videoGame){
        videoGameEntity videoGameEntity = new videoGameEntity();
        videoGameEntity.setSlug(videoGame.getSlug());
        videoGameEntity.setName(videoGame.getName());
        videoGameEntity.setReleased(videoGame.getReleased());
        videoGameEntity.setRating(videoGame.getRating());
        return videoGameEntity;
    }

    public Object videoGameModeloToVideoGameController() {
        return new VideoGameController(id, slug, name, released, rating);
    }
}
