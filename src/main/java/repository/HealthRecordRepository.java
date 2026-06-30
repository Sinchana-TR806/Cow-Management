package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRecordRepository
        extends JpaRepository<HealthRecord, Long> {
}