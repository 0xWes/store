package com.example.demo.services.busines;

import com.example.demo.model.dto.SupplierDTO;
import com.example.demo.repository.SupplierRepository;
import com.example.demo.services.ISupplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Supplier implements ISupplier {

    private final SupplierRepository supplierRepository;

    public Supplier(SupplierRepository  supplierRepository){
        this.supplierRepository = supplierRepository;
    }

    @Override
    public SupplierDTO registerSupplier(SupplierDTO supplierDTO) {
        return null;
    }

    @Override
    public SupplierDTO getSupplier(UUID uuid) {
        return null;
    }

    @Override
    public Page<SupplierDTO> allSuppliers(Pageable pageable) {
        return null;
    }

    @Override
    public SupplierDTO updateSuplier(SupplierDTO supplierDTO, UUID uuid) {
        return null;
    }

    @Override
    public void deleteSupplier(UUID uuid) {

    }
}
