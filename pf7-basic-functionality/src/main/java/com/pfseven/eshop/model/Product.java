package com.pfseven.eshop.model;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private double cost;

    public Product(String name, double cost){
        this.name = name;
        this.cost = cost;
        id = String.valueOf(Objects.hash(this.name, this.cost));
    }

    //For temporary use only
    public Product(String id, String name, double cost){
        this.name = name;
        this.cost = cost;
        this.id = id;
    }

    public double getCost(){
        return cost;
    }

    public String getID(){
        return id;
    }

    public String toString(){
        return "product's ID: " + id + " product's name: " + name + " product's cost: " + cost;
    }
}
