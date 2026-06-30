package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.MilkQuality;
import com.cdc.cowmanagement.service.MilkQualityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/milk-quality")
@CrossOrigin("*")
public class MilkQualityController {

    private final MilkQualityService service;

    public MilkQualityController(MilkQualityService service) {
        this.service = service;
    }

    @GetMapping
    public List<MilkQuality> getAll() {
        return service.getAll();
    }

    @PostMapping
    public MilkQuality save(@RequestBody MilkQuality quality) {
        return service.save(quality);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}