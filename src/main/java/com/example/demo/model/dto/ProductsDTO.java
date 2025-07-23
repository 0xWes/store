    package com.example.demo.model.dto;



    import com.example.demo.model.Brand;
    import com.example.demo.model.Category;
    import com.example.demo.model.Products;

    import java.sql.Timestamp;

    public class ProductsDTO extends BaseDTO {

        private String name;
        private String description;
        private String barcode;
        private Timestamp validateData;
        private Double price;
        private Double minPrice;
        private Double maxPrice;
        private Integer quantity;
        private String unitMeasure;
        private Brand brand;
        private Category category;

        public ProductsDTO(){}

        public ProductsDTO(Products products) {
            this.name = products.getName();
            this.description = products.getDescription();
            this.barcode = products.getBarcode();
            this.validateData = products.getValidateData();
            this.price = products.getPrice();
            this.minPrice = products.getMinPrice();
            this.maxPrice = products.getMaxPrice();
            this.quantity = products.getQuantity();
            this.unitMeasure = products.getUnitMeasure();
            this.brand = products.getBrand();
            this.category = products.getCategory();
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

        public String getBarcode() {
            return barcode;
        }

        public void setBarcode(String barcode) {
            this.barcode = barcode;
        }

        public Timestamp getValidateData() {
            return validateData;
        }

        public void setValidateData(Timestamp validateData) {
            this.validateData = validateData;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getMinPrice() {
            return minPrice;
        }

        public void setMinPrice(Double minPrice) {
            this.minPrice = minPrice;
        }

        public Double getMaxPrice() {
            return maxPrice;
        }

        public void setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getUnitMeasure() {
            return unitMeasure;
        }

        public void setUnitMeasure(String unitMeasure) {
            this.unitMeasure = unitMeasure;
        }

        public Brand getBrand() {
            return brand;
        }

        public void setBrand(Brand brand) {
            this.brand = brand;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }
    }
