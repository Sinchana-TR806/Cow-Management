package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.HealthRecord;
import com.cdc.cowmanagement.repository.HealthRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthRecordService {

    private final HealthRecordRepository repository;

    public HealthRecordService(HealthRecordRepository repository) {
        this.repository = repository;
    }

    public List<HealthRecord> getAll() {
        return repository.findAll();
    }

    public HealthRecord save(HealthRecord record) {
        return repository.save(record);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}