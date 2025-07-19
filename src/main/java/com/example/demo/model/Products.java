package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "products")
public class Products  extends  Base {

    private String name;
    private String description;
    private String barcode;
    private Timestamp validateData;

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
}
