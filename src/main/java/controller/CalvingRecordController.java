package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.CalvingRecord;
import com.cdc.cowmanagement.service.CalvingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calving")
@CrossOrigin("*")
public class CalvingRecordController {

    @Autowired
    private CalvingRecordService service;

    @GetMapping
    public List<CalvingRecord> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CalvingRecord save(@RequestBody CalvingRecord record) {
        return service.save(record);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}