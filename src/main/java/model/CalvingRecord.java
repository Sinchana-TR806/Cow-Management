package com.cdc.cowmanagement.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "calving_records")
public class CalvingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cowId;
    private String cowName;
    private LocalDate calvingDate;
    private String calfTag;
    private String calfGender;
    private Double calfWeight;
    private String difficulty;
    private String status;
    private String remarks;

    public CalvingRecord() {
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

    public LocalDate getCalvingDate() {
        return calvingDate;
    }

    public void setCalvingDate(LocalDate calvingDate) {
        this.calvingDate = calvingDate;
    }

    public String getCalfTag() {
        return calfTag;
    }

    public void setCalfTag(String calfTag) {
        this.calfTag = calfTag;
    }

    public String getCalfGender() {
        return calfGender;
    }

    public void setCalfGender(String calfGender) {
        this.calfGender = calfGender;
    }

    public Double getCalfWeight() {
        return calfWeight;
    }

    public void setCalfWeight(Double calfWeight) {
        this.calfWeight = calfWeight;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}