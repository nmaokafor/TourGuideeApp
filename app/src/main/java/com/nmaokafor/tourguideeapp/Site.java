package com.nmaokafor.tourguideeapp;

import android.util.Log;

public class Site {
    private String name;
    private String description;
    private String spot;
    private String number;
    private String timing;
    private String pricing;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Site(String name, String description, String spot, String number, String timing,
                String pricing, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.spot = spot;
        this.number = number;
        this.timing = timing;
        this.pricing = pricing;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getSpot() {
        return spot;
    }

    public String getNumber() {
        return number;
    }

    public String getTime() {
        return timing;
    }

    public String getPrice() {
        return pricing;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        Log.v("hasImage", "word has image: " + (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
    public boolean hasName() {
        return getName() != null;
    }

    public boolean hasPrice() {
        return getPrice() != null;
    }

    public boolean hasNumber() {
        return getNumber() != null;
    }

    public boolean hasSpot() {
        return getSpot() != null;
    }

    public boolean hasTime() {
        return getTime() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getSpot() + "\n" +
                getNumber() + "\n" +
                getPrice() + "\n" +
                getTime() + "\n" +
                getImageResourceId();

        return output;
    }
}
