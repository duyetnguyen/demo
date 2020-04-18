package com.finalproject.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "product")

public class Product {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private float price;
    @Column(name = "category")
    private String category;

    public Product()
    {

    }

    public Product(String id, String description, float price, String category)
    {
        this.id = id;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
