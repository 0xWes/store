package com.example.demo.model;

import com.example.demo.model.dto.SupplierDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.PreRemove;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier extends Base{

    private String name;
    private String fantasyName;
    private String document;
    private String stateRegistration;

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

    public Supplier(){}

    public Supplier(SupplierDTO supplierDTO){
        this.name = supplierDTO.getName();
        this.fantasyName =  supplierDTO.getFantasyName();
        this.document =  supplierDTO.getDocument();
        this.stateRegistration = supplierDTO.getStateRegistration();

        this.setUuid(supplierDTO.getUuid());
        this.setCreated(supplierDTO.getCreated());
        this.setModified(supplierDTO.getModified());
        this.setActive(supplierDTO.getActive());
    }

    @PreRemove
    public void preventDelete() {
        throw new UnsupportedOperationException("Exclusão física não permitida. Use desativação lógica.");
    }
}
