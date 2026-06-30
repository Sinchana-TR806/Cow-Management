package com.cdc.cowmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "milk_quality")
public class MilkQuality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String testDate;
    private String batch;

    private Double fat;
    private Double snf;
    private Double protein;
    private Double scc;

    private String adulteration;
    private String grade;

    public MilkQuality() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
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

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getScc() {
        return scc;
    }

    public void setScc(Double scc) {
        this.scc = scc;
    }

    public String getAdulteration() {
        return adulteration;
    }

    public void setAdulteration(String adulteration) {
        this.adulteration = adulteration;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}