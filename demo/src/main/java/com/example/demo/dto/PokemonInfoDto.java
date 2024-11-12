package com.example.demo.dto;
import java.util.List;

public class PokemonInfoDto {
    private String name;
    private List<String> types;

    public PokemonInfoDto(String name, List<String> types) {
        this.name = name;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}