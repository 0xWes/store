package com.example.demo.repository;

import com.example.demo.model.Supplier;
import com.example.demo.model.dto.SupplierDTO;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class SupplierRepositoryTest {

    @Autowired
    EntityManager entityManager;

    @Autowired
    SupplierRepository supplierRepository;

    @Test
    @DisplayName("Return successfully")
    void deactivateSupplierSuccess() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        String document = "86480596000190";
        SupplierDTO supplierDTO = new SupplierDTO(
                null, now, now, true,
                "Teste", "Teste Sucesso",  document,  "PR");
        this.createSupplier(supplierDTO);

        Optional<Supplier> supplier = this.supplierRepository.findByDocument(document);
        Supplier supplier1 = supplier.get();

        this.supplierRepository.deactivateSupplier(supplier1.getUuid());
    }
    @Test
    @DisplayName("Return notfound")
    void deactivateSupplierError() {
       UUID uuid = UUID.randomUUID();
        this.supplierRepository.deactivateSupplier(uuid);
    }

    private Supplier createSupplier(SupplierDTO supplierDTO) {
        Supplier supplier =  new Supplier(supplierDTO);
        this.entityManager.persist(supplier);
        return supplier;
    }
}