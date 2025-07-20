    package com.example.demo.model.dto;



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
        private BrandDTO brand;
        private CategoryDTO category;

        public ProductsDTO(){}

        public ProductsDTO(String name, String description, String barcode, Timestamp validateData, Double price, Double minPrice, Double maxPrice, Integer quantity, String unitMeasure, BrandDTO brand, CategoryDTO category) {
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

        public BrandDTO getBrand() {
            return brand;
        }

        public void setBrand(BrandDTO brand) {
            this.brand = brand;
        }

        public CategoryDTO getCategory() {
            return category;
        }

        public void setCategory(CategoryDTO category) {
            this.category = category;
        }
    }
