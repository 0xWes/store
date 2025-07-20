package com.example.demo.model.dto;

public class CategoryDTO extends BaseDTO {

    private String name;


    public CategoryDTO(){}
    public CategoryDTO(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
