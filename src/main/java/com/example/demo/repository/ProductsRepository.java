package com.example.demo.repository;

import com.example.demo.model.Products;
import com.example.demo.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductsRepository extends JpaRepository<Products, UUID> {
}
