package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.PokemonInfoDto;
import com.example.demo.dto.PokemonResponseDto;

import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String POKE_API_BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    public String getString(String str) {
        return "Hello, " + str;
    }

    // ポケモンの名前とタイプを取得
    public PokemonInfoDto getPokemonInfo(String name) {
        try {
            String url = POKE_API_BASE_URL + name.toLowerCase();
            PokemonResponseDto response = restTemplate.getForObject(url, PokemonResponseDto.class);

            if (response != null) {
                List<String> types = response.getTypes().stream()
                        .map(typeSlot -> typeSlot.getType().getName())
                        .collect(Collectors.toList());

                return new PokemonInfoDto(response.getName(), types);
            }
        } catch (HttpClientErrorException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return new PokemonInfoDto("Unknown", List.of("Unknown"));
    }
}