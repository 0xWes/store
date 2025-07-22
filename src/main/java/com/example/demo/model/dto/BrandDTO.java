package com.example.demo.model.dto;

import com.example.demo.model.Brand;
import com.example.demo.model.Products;

import java.util.List;

public class BrandDTO extends BaseDTO {

    private String name;
    private String description;
    private String image_logo;
    private List<Products> products;

    public BrandDTO() {}
    public BrandDTO(Brand brand) {
        this.name = brand.getName();
        this.description = brand.getDescription();
        this.image_logo = brand.getImageLogo();
        this.products = brand.getProducts();
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
