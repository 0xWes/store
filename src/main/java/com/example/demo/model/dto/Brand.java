package com.example.demo.model.dto;

import java.util.List;

public class Brand extends Base {

    private String name;
    private String description;
    private String image_logo;
    private List<Products> products;

    public Brand() {}
    public Brand(String name, String description, String image_logo, List<Products> products) {
        this.name = name;
        this.description = description;
        this.image_logo = image_logo;
        this.products = products;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_logo() {
        return image_logo;
    }

    public void setImage_logo(String image_logo) {
        this.image_logo = image_logo;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
