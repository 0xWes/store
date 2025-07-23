package com.example.demo.controller;


import com.example.demo.model.dto.SupplierDTO;
import com.example.demo.services.ISupplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    private final ISupplier iSupplier;

    public SupplierController(ISupplier iSupplier) {
        this.iSupplier = iSupplier;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody SupplierDTO supplierDTO) {
        SupplierDTO dto = iSupplier.registerSupplier(supplierDTO);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/update/{uuid}")
    public ResponseEntity<?> update(@RequestBody SupplierDTO supplierDTO, @PathVariable UUID uuid) {
        SupplierDTO dto = iSupplier.updateSuplier(supplierDTO, uuid);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/deactivate/{uuid}")
    public ResponseEntity<Void> deactivate(@PathVariable UUID uuid){
        iSupplier.deleteSupplier(uuid);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<SupplierDTO> getByUuid(@PathVariable UUID uuid) {
        SupplierDTO supplierDTO = iSupplier.getSupplier(uuid);
        return ResponseEntity.ok(supplierDTO);
    }

    @GetMapping
    public ResponseEntity<Page<SupplierDTO>> listSuppliers(Pageable pageable) {
        Page<SupplierDTO> suppliersPage = iSupplier.allSuppliers(pageable);
        return ResponseEntity.ok(suppliersPage);
    }
}
