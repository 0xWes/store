package com.example.demo.model.dto;

import java.util.List;

public class BrandDTO extends BaseDTO {

    private String name;
    private String description;
    private String image_logo;
    private List<ProductsDTO> products;

    public BrandDTO() {}
    public BrandDTO(String name, String description, String image_logo, List<ProductsDTO> products) {
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

    public List<ProductsDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsDTO> products) {
        this.products = products;
    }
}
