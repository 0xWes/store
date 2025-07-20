    package com.example.demo.model.dto;



    import java.sql.Timestamp;

    public class Products  extends Base {

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

        public Products(){}

        public Products(String name, String description, String barcode, Timestamp validateData, Double price, Double minPrice, Double maxPrice, Integer quantity, String unitMeasure, Brand brand, Category category) {
            this.name = name;
            this.description = description;
            this.barcode = barcode;
            this.validateData = validateData;
            this.price = price;
            this.minPrice = minPrice;
            this.maxPrice = maxPrice;
            this.quantity = quantity;
            this.unitMeasure = unitMeasure;
            this.brand = brand;
            this.category = category;
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
