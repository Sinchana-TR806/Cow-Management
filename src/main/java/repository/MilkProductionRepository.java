package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.MilkProduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilkProductionRepository
        extends JpaRepository<MilkProduction, Long> {
}