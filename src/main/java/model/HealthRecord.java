package com.cdc.cowmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "health_records")
@Data
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cow_id")
    private String cowId;

    private LocalDate date;

    private String diagnosis;

    private String veterinarian;

    private String treatment;

    private Double cost;

    private String status;
}