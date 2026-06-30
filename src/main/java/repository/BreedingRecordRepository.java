package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.BreedingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedingRecordRepository
        extends JpaRepository<BreedingRecord, Long> {
}