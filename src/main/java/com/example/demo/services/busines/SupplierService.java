package com.example.demo.services.busines;

import com.example.demo.exception.ResourceConflictException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Supplier;
import com.example.demo.model.dto.SupplierDTO;
import com.example.demo.repository.SupplierRepository;
import com.example.demo.services.ISupplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;


@Service
public class SupplierService implements ISupplier {

    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository  supplierRepository){
        this.supplierRepository = supplierRepository;
    }

    @Override
    public SupplierDTO registerSupplier(SupplierDTO supplierDTO) {
        Optional<Supplier> supplierOptional = supplierRepository.findByDocument(supplierDTO.getDocument());
        if (supplierOptional.isPresent()) {
            throw new ResourceConflictException("Já existe um fornecedor com esse CNPJ cadastrado.");
        }
        Supplier supplier = new Supplier(supplierDTO);
        supplierRepository.save(supplier);
        return supplierDTO;
    }

    @Override
    public SupplierDTO getSupplier(UUID uuid) {
        Optional<Supplier> supplierOptional = supplierRepository.findById(uuid);
        Supplier supplier = supplierOptional
                .orElseThrow(() -> new ResourceNotFoundException("Fornecedor não encontrado"));
        return new SupplierDTO(supplier);
    }

    @Override
    public Page<SupplierDTO> allSuppliers(Pageable pageable) {
        Page<Supplier> supplierPage = supplierRepository.findAll(pageable);
        return supplierPage.map(SupplierDTO::new);
    }

    @Override
    public SupplierDTO updateSuplier(SupplierDTO supplierDTO, UUID uuid) {
        Optional<Supplier> supplierOptional = supplierRepository.findById(uuid);
        Supplier supplier = supplierOptional
                .orElseThrow(() -> new ResourceNotFoundException("Fornecedor não encontrado"));
        updateFromDTO(supplierDTO, supplier);
        supplierRepository.save(supplier);

        return new SupplierDTO(supplier);
    }

    @Transactional
    @Override
    public void deleteSupplier(UUID uuid) {
        Optional<Supplier> supplierOptional = supplierRepository.findById(uuid);
        Supplier supplier = supplierOptional
                .orElseThrow(() -> new ResourceNotFoundException("Fornecedor não encontrado"));
        supplierRepository.deactivateSupplier(supplier.getUuid());
    }

    private Supplier updateFromDTO(SupplierDTO supplierDTO, Supplier supplier) {
            supplier.setFantasyName(supplierDTO.getFantasyName());
            supplier.setDocument(supplierDTO.getDocument());
            supplier.setStateRegistration(supplierDTO.getStateRegistration());

            return supplier;

    }
}
