package com.videoGames.videoGame.infrastucture.controlador;


import com.videoGames.videoGame.application.service.ListVideoGameService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Controllador {

    private final ListVideoGameService listVideoGameService;

    public Controllador(ListVideoGameService listVideoGameService) {
        this.listVideoGameService = listVideoGameService;
    }
}
