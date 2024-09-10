package com.videoGames.videoGame.application;

import com.videoGames.videoGame.application.service.ListVideoGameService;
import com.videoGames.videoGame.domain.modelo.VideoGame;
import com.videoGames.videoGame.domain.puerto.VideoGameRepository;
import com.videoGames.videoGame.infrastucture.modelo.VideoGameController;
import com.videoGames.videoGame.infrastucture.rawgAPI.impl.RawImpl;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ListVideoGames implements ListVideoGameService {
    private final RawImpl rawg;
    private final VideoGameRepository videoGameRepository;


    public List<VideoGame> getVideoGames(){
        return videoGameRepository.getVideoGames();
    }

    @Override
    public List<VideoGameController> getVideoGame() {
        Object mapper = new Object();
        mapper = rawg.getRoutes("e5df3ebadf384435ae84a0bfdf559592");
        List<VideoGameController> videoGameController = (List<VideoGameController>) mapper;
        return videoGameController;

    }
}
