package com.example.demo.model.dto;

public class SupplierDTO extends BaseDTO {
    private String name;
    private String fantasyName;
    private String document;
    private String stateRegistration;

    public SupplierDTO(){}

    public SupplierDTO(String name, String fantasyName, String document, String stateRegistration) {
        this.name = name;
        this.fantasyName = fantasyName;
        this.document = document;
        this.stateRegistration = stateRegistration;
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
