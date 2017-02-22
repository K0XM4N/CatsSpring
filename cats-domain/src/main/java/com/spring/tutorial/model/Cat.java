package com.spring.tutorial.model;

/**
 * Created by HD29QN on 2017-02-22.
 */
public class Cat {

    private int id;

    private String name;

    private String race;

    private String eyeColor;


    public Cat() {
    }

    public Cat(String name, String race, String eyeColor) {
        this.name = name;
        this.race = race;
        this.eyeColor = eyeColor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
