package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.Cow;
import com.cdc.cowmanagement.service.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cows")
@CrossOrigin("*")
public class CowController {

    @Autowired
    private CowService service;

    @GetMapping
    public List<Cow> getAll() {
        return service.getAllCows();
    }

    @PostMapping
    public Cow save(@RequestBody Cow cow) {
        return service.saveCow(cow);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteCow(id);
    }
}