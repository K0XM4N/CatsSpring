package com.spring.tutorial.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by HD29QN on 2017-02-16.
 */
public class FormDTO {

    @NotEmpty
    @Size(min = 2, max = 15)
    private String catName;

    @NotEmpty
    @Size(min = 3, max = 20)
    private String race;

    @NotEmpty
    @Size(min = 3, max = 10)
    private String catEyeColor;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCatEyeColor() {
        return catEyeColor;
    }

    public void setCatEyeColor(String catEyeColor) {
        this.catEyeColor = catEyeColor;
    }
}
