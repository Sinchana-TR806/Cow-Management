package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.BreedingRecord;
import com.cdc.cowmanagement.repository.BreedingRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreedingRecordService {

    @Autowired
    private BreedingRecordRepository repository;

    // Get all breeding records
    public List<BreedingRecord> getAllRecords() {
        return repository.findAll();
    }

    // Save breeding record
    public BreedingRecord saveRecord(BreedingRecord record) {
        return repository.save(record);
    }

    // Get one record by ID
    public BreedingRecord getRecordById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Delete record
    public void deleteRecord(Long id) {
        repository.deleteById(id);
    }

    // Update record
    public BreedingRecord updateRecord(Long id, BreedingRecord record) {
        record.setId(id);
        return repository.save(record);
    }
}