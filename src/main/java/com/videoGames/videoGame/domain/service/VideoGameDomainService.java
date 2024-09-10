package com.videoGames.videoGame.domain.service;

import com.videoGames.videoGame.domain.modelo.VideoGame;

public class VideoGameDomainService {

    private static final int MAX_NOMBRE_LENGTH = 255;

    public void validarRegistro(VideoGame videoGame){
        if (videoGame.getName()==null || videoGame.getName().isEmpty()){
            throw new IllegalArgumentException("El nombre del Video Juego no puede estar vacío");
        }
        if (videoGame.getName().length()>MAX_NOMBRE_LENGTH){
            throw new IllegalArgumentException("El nombre del Video Juego no puede sobrepasar los"+MAX_NOMBRE_LENGTH+" Caracteres");

        }

    }
}
