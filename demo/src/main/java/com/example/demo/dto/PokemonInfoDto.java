package com.example.demo.dto;

public class PokemonInfoDto {
    private String name;
    private String types;

    public PokemonInfoDto(String name, String types) {
        this.name = name;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
}