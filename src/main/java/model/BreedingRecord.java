package com.cdc.cowmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "breeding_records")
@Data
public class BreedingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cowId;
    private String method;
    private String date;
    private String sireSemen;
    private String confirmedPreg;
    private String expectedCalving;
    private String result;
    private Double cost;
}