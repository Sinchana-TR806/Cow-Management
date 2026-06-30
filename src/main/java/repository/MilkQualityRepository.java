package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.MilkQuality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilkQualityRepository
        extends JpaRepository<MilkQuality, Long> {
}