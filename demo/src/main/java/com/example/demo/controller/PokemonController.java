package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.PokemonInfoDto;
import com.example.demo.service.PokemonService;

@RestController
@RequestMapping("pokemon")
@CrossOrigin
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{name}")
    public PokemonInfoDto getPokemon(@PathVariable String name) {
        return pokemonService.getPokemonInfo(name);
    }
    
    
}

