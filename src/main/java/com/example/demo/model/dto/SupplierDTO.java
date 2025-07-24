package com.example.demo.model.dto;

import com.example.demo.model.Supplier;

public class SupplierDTO extends BaseDTO {
    private String name;
    private String fantasyName;
    private String document;
    private String stateRegistration;

    public SupplierDTO(){}

    public SupplierDTO(Supplier supplier) {
        this.setUuid(supplier.getUuid());
        this.setCreated(supplier.getCreated());
        this.setModified(supplier.getModified());
        this.setActive(supplier.getActive());
        this.name = supplier.getName();
        this.fantasyName = supplier.getFantasyName();
        this.document = supplier.getDocument();
        this.stateRegistration = supplier.getStateRegistration();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }
}
