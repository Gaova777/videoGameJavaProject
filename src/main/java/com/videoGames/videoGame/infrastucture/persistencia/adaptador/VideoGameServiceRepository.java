package com.videoGames.videoGame.infrastucture.persistencia.adaptador;

import com.videoGames.videoGame.domain.modelo.VideoGame;
import com.videoGames.videoGame.domain.puerto.VideoGameRepository;
import com.videoGames.videoGame.infrastucture.persistencia.entidad.videoGameEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VideoGameServiceRepository implements VideoGameRepository {
    @Autowired
    private final VideoGameCrudRepository videoGameCrudRepository;

    public VideoGameServiceRepository(VideoGameCrudRepository videoGameCrudRepository) {
        this.videoGameCrudRepository = videoGameCrudRepository;
    }

    @Override
    public Integer saveVideoGame(VideoGame game) {
        return 0;
    }

    @Override
    public Boolean getVideoGameByID(Integer id) {
        return null;
    }

    @Override
    public List<Object> getVideoGames() {
        List<videoGameEntity> videoGameEntities = videoGameCrudRepository.findAll();
        if(videoGameEntities.isEmpty()){
            return Optional.empty().stream().toList();
        }else {
            return videoGameEntities.stream().map(videoGameEntity::videoGameModeloToVideoGameController).toList();
        }

    }
}
