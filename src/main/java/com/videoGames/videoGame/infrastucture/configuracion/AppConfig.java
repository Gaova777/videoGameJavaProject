package com.videoGames.videoGame.infrastucture.configuracion;

import com.videoGames.videoGame.application.ListVideoGames;
import com.videoGames.videoGame.application.service.ListVideoGameService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public ListVideoGames listVideoGames(RestTemplate restTemplate){
        return new ListVideoGames(restTemplate);
    }

}
