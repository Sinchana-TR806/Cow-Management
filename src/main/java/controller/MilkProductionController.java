package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.MilkProduction;
import com.cdc.cowmanagement.service.MilkProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/milk")
@CrossOrigin("*")
public class MilkProductionController {

    @Autowired
    private MilkProductionService service;

    @GetMapping
    public List<MilkProduction> getAll() {
        return service.getAll();
    }

    @PostMapping
    public MilkProduction save(@RequestBody MilkProduction milk) {
        return service.save(milk);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}