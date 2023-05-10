package com.example.rasteniya;

public class Flower {
    private String name, flowerDescription;
    private int flowerResource;


    public Flower(String name,String flowerDescription,int flowerResource ){
        this.name=name;
        this.flowerDescription=flowerDescription;
        this.flowerResource=flowerResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerDescription() {
        return flowerDescription;
    }

    public void setFlowerDescription(String flowerDescription) {
        this.flowerDescription = flowerDescription;
    }

    public int getFlowerResource() {
        return flowerResource;
    }

    public void setFlowerResource(int flowerResource) {
        this.flowerResource = flowerResource;
    }
}
