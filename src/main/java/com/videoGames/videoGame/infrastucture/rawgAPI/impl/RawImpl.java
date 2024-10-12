package com.videoGames.videoGame.infrastucture.rawgAPI.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class RawImpl {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;  // Inyectado automáticamente por Spring Boot

    public String getRoutes(String token) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> requestEntity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange(
                    "https://api.rawg.io/api/games?key=" + token,
                    HttpMethod.GET,
                    requestEntity,
                    String.class);
            return response.getBody();
        } catch (RestClientException e) {
            e.printStackTrace();
            return null;
        }
    }
}
