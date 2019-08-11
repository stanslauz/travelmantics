package com.example.android.travelmantics;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String price;
    private String description;
    private String title;
    private String imageUrl;

    public TravelDeal(){}

    public TravelDeal( String price, String description, String title, String imageUrl) {
        this.setId(id);
        this.setPrice(price);
        this.setDescription(description);
        this.setTitle(title);
        this.setImageUrl(imageUrl);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
