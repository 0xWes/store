package com.example.demo.model.dto;

public class Category extends Base {

    private String name;


    public Category(){}
    public Category(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
