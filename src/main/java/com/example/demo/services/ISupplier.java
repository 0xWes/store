package com.example.demo.services;

import com.example.demo.model.dto.SupplierDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ISupplier {
    SupplierDTO registerSupplier(SupplierDTO supplierDTO);
    SupplierDTO getSupplier(UUID uuid);
    Page<SupplierDTO> allSuppliers(Pageable pageable);
    SupplierDTO updateSuplier(SupplierDTO supplierDTO, UUID uuid);
    void deleteSupplier(UUID uuid);
}
