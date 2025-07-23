package com.example.demo.repository;

import com.example.demo.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
    Optional<Supplier> findByDocument(String document);

    @Modifying
    @Query("UPDATE Supplier  s  SET s.active = false WHERE s.uuid = :uuid ")
    void deactivateSupplier(UUID uuid);
}
