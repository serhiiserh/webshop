package com.webshop.models;

public class Item {
    private String title;
    private String rating;
    private String price;
    private String description;

    public String getTitle() {
        return title;
    }

    public Item setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getRating() {
        return rating;
    }

    public Item setRating(String rating) {
        this.rating = rating;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Item setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }
}
