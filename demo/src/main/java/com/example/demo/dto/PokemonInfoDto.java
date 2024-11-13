package com.example.demo.dto;

public class PokemonInfoDto {
    private String name;
    private String types;
    private String id;
    private String imageUrl;

    public PokemonInfoDto(String name, String types, String id, String imageUrl) {
        this.name = name;
        this.types = types;
        this.id = id;
        this.imageUrl = imageUrl;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}