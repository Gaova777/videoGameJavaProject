package com.videoGames.videoGame.application;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.videoGames.videoGame.domain.modelo.VideoGame;
import com.videoGames.videoGame.domain.puerto.VideoGameRepository;
import com.videoGames.videoGame.infrastucture.rawgAPI.impl.RawImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ListVideoGames {

    @Autowired
    private final RawImpl rawg;

    @Autowired
    private final VideoGameRepository videoGameRepository;

    // Aquí se inyecta el ObjectMapper de Spring Boot
    @Autowired
    private final ObjectMapper objectMapper;

    public List<VideoGame> getVideoGame() {
        try {
            String jsonResponse = rawg.getRoutes("e5df3ebadf384435ae84a0bfdf559592");

            // Utiliza el ObjectMapper de Spring para leer el JSON
            JsonNode rootNode = objectMapper.readTree(jsonResponse);
            JsonNode resultNode = rootNode.get("results");

            List<VideoGame> videoGames = new ArrayList<>();
            if (resultNode.isArray()) {
                for (JsonNode videoGameNode : resultNode) {
                    VideoGame videoGame = objectMapper.treeToValue(videoGameNode, VideoGame.class);
                    videoGames.add(videoGame);
                }
            }
            return videoGames;

        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
