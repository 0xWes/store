package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "invoice_nf")
public class Invoice extends Base {

    private Integer numberInvoice;
    private String serie;
    private Timestamp emited;
    private Timestamp departureDate;
    private Double productsValue;
    private Double totalValue;
    private Double taxValue;
    private String keyAccess;
    private String type;
    private String status;
    private String documentSupplier;


    public Integer getNumberInvoice() {
        return numberInvoice;
    }

    public void setNumberInvoice(Integer numberInvoice) {
        this.numberInvoice = numberInvoice;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Timestamp getEmited() {
        return emited;
    }

    public void setEmited(Timestamp emited) {
        this.emited = emited;
    }

    public Timestamp getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Timestamp departureDate) {
        this.departureDate = departureDate;
    }

    public Double getProductsValue() {
        return productsValue;
    }

    public void setProductsValue(Double productsValue) {
        this.productsValue = productsValue;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Double getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(Double taxValue) {
        this.taxValue = taxValue;
    }

    public String getKeyAccess() {
        return keyAccess;
    }

    public void setKeyAccess(String keyAccess) {
        this.keyAccess = keyAccess;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocumentSupplier() {
        return documentSupplier;
    }

    public void setDocumentSupplier(String documentSupplier) {
        this.documentSupplier = documentSupplier;
    }
}
