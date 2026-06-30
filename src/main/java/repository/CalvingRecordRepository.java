package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.CalvingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalvingRecordRepository
        extends JpaRepository<CalvingRecord, Long> {
}