package com.grow.plantillatabs.models;

/**
 * Created by growcallisaya on 12/26/17.
 */

public class Planets {
    private String name;
    private String color;
    private String habitants;
    private String image;

    public Planets() {
    }

    public Planets(String name, String color, String habitants, String image) {
        this.name = name;
        this.color = color;
        this.habitants = habitants;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitants() {
        return habitants;
    }

    public void setHabitants(String habitants) {
        this.habitants = habitants;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", habitants='" + habitants + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
