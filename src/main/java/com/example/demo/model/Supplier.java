package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplie")
public class Supplier extends Base{

    private String name;
    private String fantasyName;
    private String document;
    private String stateRegistration;
    
}
