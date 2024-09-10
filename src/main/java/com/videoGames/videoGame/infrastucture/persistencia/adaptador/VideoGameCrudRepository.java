package com.videoGames.videoGame.infrastucture.persistencia.adaptador;

import com.videoGames.videoGame.infrastucture.persistencia.entidad.videoGameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoGameCrudRepository extends JpaRepository<videoGameEntity, Integer> {
}
