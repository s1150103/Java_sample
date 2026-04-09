package com.example;

public class AnimalResponse {
    private String name;
    private String type;
    private String sound;

    public AnimalResponse(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public String getSound() { return sound; }
}
