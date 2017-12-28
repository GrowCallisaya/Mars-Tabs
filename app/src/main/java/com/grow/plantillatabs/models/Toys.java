package com.grow.plantillatabs.models;

/**
 * Created by growcallisaya on 12/26/17.
 */

public class Toys {
    private String name;
    private String image;
    private double price;

    public Toys() {
    }

    public Toys(String image, String name, double price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
