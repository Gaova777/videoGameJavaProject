package com.videoGames.videoGame.infrastucture.configuracion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.videoGames.videoGame.application.ListVideoGames;
import com.videoGames.videoGame.infrastucture.persistencia.adaptador.VideoGameCrudRepository;
import com.videoGames.videoGame.infrastucture.persistencia.adaptador.VideoGameServiceRepository;
import com.videoGames.videoGame.infrastucture.rawgAPI.impl.RawImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    private VideoGameCrudRepository videoGameCrudRepository;

    @Bean
    public VideoGameServiceRepository videoGameServiceRepository() {
        return new VideoGameServiceRepository(videoGameCrudRepository);
    }

    // Agregamos ObjectMapper como tercer argumento en el constructor
    @Bean
    public ListVideoGames listVideoGames(RawImpl rawImpl, VideoGameServiceRepository videoGameServiceRepository, ObjectMapper objectMapper) {
        return new ListVideoGames(rawImpl, videoGameServiceRepository, objectMapper);
    }
}
