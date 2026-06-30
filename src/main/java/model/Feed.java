package com.sridairy.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "feed")
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String feedType;
    private Double qtyPerHead;
    private Integer noOfAnimals;
    private Double totalQty;

    // Feed Purchase fields
    private Double quantity;
    private Double rate;
    private String supplier;
    private String paymentMode;
    private LocalDate purchaseDate;

    public Feed() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public Double getQtyPerHead() {
        return qtyPerHead;
    }

    public void setQtyPerHead(Double qtyPerHead) {
        this.qtyPerHead = qtyPerHead;
    }

    public Integer getNoOfAnimals() {
        return noOfAnimals;
    }

    public void setNoOfAnimals(Integer noOfAnimals) {
        this.noOfAnimals = noOfAnimals;
    }

    public Double getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Double totalQty) {
        this.totalQty = totalQty;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}