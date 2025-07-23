package com.example.demo.repository;

import com.example.demo.model.Invoice;
import com.example.demo.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InvoiceRepository extends JpaRepository<Invoice, UUID> {
}
