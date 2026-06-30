package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.HealthRecord;
import com.cdc.cowmanagement.service.HealthRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/health")
@CrossOrigin("*")
public class HealthRecordController {

    private final HealthRecordService service;

    public HealthRecordController(HealthRecordService service) {
        this.service = service;
    }

    @GetMapping
    public List<HealthRecord> getAll() {
        return service.getAll();
    }

    @PostMapping
    public HealthRecord save(@RequestBody HealthRecord record) {
        return service.save(record);
    }
}