package com.cdc.cowmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "milk_production")
public class MilkProduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cowId;
    private String cowName;
    private Double morningMilk;
    private Double eveningMilk;
    private Double totalMilk;
    private Double fat;
    private Double snf;
    private String quality;
    private String remarks;

    public MilkProduction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCowId() {
        return cowId;
    }

    public void setCowId(String cowId) {
        this.cowId = cowId;
    }

    public String getCowName() {
        return cowName;
    }

    public void setCowName(String cowName) {
        this.cowName = cowName;
    }

    public Double getMorningMilk() {
        return morningMilk;
    }

    public void setMorningMilk(Double morningMilk) {
        this.morningMilk = morningMilk;
    }

    public Double getEveningMilk() {
        return eveningMilk;
    }

    public void setEveningMilk(Double eveningMilk) {
        this.eveningMilk = eveningMilk;
    }

    public Double getTotalMilk() {
        return totalMilk;
    }

    public void setTotalMilk(Double totalMilk) {
        this.totalMilk = totalMilk;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getSnf() {
        return snf;
    }

    public void setSnf(Double snf) {
        this.snf = snf;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}