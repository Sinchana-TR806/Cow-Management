package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.CalvingRecord;
import com.cdc.cowmanagement.repository.CalvingRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalvingRecordService {

    @Autowired
    private CalvingRecordRepository repository;

    public List<CalvingRecord> getAll() {
        return repository.findAll();
    }

    public CalvingRecord save(CalvingRecord record) {
        return repository.save(record);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}