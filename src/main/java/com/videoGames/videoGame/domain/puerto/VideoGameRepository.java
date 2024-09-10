package com.videoGames.videoGame.domain.puerto;

import com.videoGames.videoGame.domain.modelo.VideoGame;

import java.util.List;

public interface VideoGameRepository {

    Integer saveVideoGame(VideoGame game);

    Boolean getVideoGameByID(Integer id);


    List<VideoGame> getVideoGames();
}
