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
    private final RestTemplate client;
    private final ObjectMapper mapper;

    public Object getRoutes(String token){
        try {
           RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
            ResponseEntity<Object> response = restTemplate.exchange(
                    "https://api.rawg.io/api/games?key=" + token,
                    HttpMethod.GET,
                    requestEntity,
                    Object.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                return response.getBody();
            } else {
                return response.getStatusCodeValue();
            }


        } catch (RestClientException e) {
            return e.getMessage();
        }
    }
}
