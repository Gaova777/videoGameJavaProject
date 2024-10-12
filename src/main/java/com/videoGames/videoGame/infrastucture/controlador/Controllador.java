package com.videoGames.videoGame.infrastucture.controlador;


import com.videoGames.videoGame.application.ListVideoGames;
import com.videoGames.videoGame.application.service.ListVideoGameService;
import com.videoGames.videoGame.domain.modelo.VideoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class Controllador {
    @Autowired
    private final ListVideoGames listVideoGames;



    public Controllador(ListVideoGames listVideoGames) {
        this.listVideoGames = listVideoGames;
    }




   @GetMapping(path = "videoGame")
    public ResponseEntity<List<VideoGame>> getVideoGame() {

        return ResponseEntity.ok(listVideoGames.getVideoGame());
    }
}
