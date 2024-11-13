package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.PokemonInfoDto;
import com.example.demo.dto.PokemonRequestDto;
import com.example.demo.service.PokemonService;

@RestController
@RequestMapping("pokemon")
@CrossOrigin
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @PostMapping("/post")
    public PokemonInfoDto getPokemonPost(@RequestBody PokemonRequestDto pokemonRequestDto) {
        return pokemonService.getPokemonInfo(pokemonRequestDto);
    }
}

