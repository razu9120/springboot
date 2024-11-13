package com.example.demo.dto;

import java.util.List;

public class PokemonResponseDto {
    private String name;
    private List<TypeList> types;
    private String id;
    private Sprites sprites;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TypeList> getTypes() {
        return types;
    }

    public void setTypes(List<TypeList> types) {
        this.types = types;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public static class TypeList {
        private Type type;

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }
    }

    public static class Type {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Sprites {
        private String front_default; // 画像URL
    
        public String getFront_default() {
            return front_default;
        }
    
        public void setFront_default(String front_default) {
            this.front_default = front_default;
        }
    }
    
}
