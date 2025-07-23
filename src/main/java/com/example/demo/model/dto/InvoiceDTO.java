package com.example.demo.model.dto;

import com.example.demo.model.Invoice;

import java.sql.Timestamp;

public class InvoiceDTO extends BaseDTO {

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

    public InvoiceDTO(){}
    public InvoiceDTO(Invoice invoice) {
        this.numberInvoice = invoice.getNumberInvoice();
        this.serie = invoice.getSerie();
        this.emited = invoice.getEmited();
        this.departureDate = invoice.getDepartureDate();
        this.productsValue = invoice.getProductsValue();
        this.totalValue = invoice.getTotalValue();
        this.taxValue = invoice.getTaxValue();
        this.keyAccess = invoice.getKeyAccess();
        this.type = invoice.getType();
        this.status = invoice.getStatus();
        this.documentSupplier = invoice.getDocumentSupplier();
    }

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
