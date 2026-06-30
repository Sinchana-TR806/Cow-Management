package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.BreedingRecord;
import com.cdc.cowmanagement.repository.BreedingRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/breeding")
@CrossOrigin("*")
public class BreedingRecordController {

    private final BreedingRecordRepository repository;

    public BreedingRecordController(BreedingRecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<BreedingRecord> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public BreedingRecord save(@RequestBody BreedingRecord record) {
        return repository.save(record);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}