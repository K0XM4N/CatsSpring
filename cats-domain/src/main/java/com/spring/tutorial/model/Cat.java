package com.spring.tutorial.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by HD29QN on 2017-02-22.
 */
@Entity
@Table(name = "cat")
public class Cat {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String race;

    @Column(name = "eye_color", nullable = false)
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
