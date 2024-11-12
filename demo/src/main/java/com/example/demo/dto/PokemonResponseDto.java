package com.example.demo.dto;

import java.util.List;

public class PokemonResponseDto {
    private String name;
    private List<TypeList> types;

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
}
