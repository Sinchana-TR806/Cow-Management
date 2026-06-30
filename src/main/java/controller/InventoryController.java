package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.Inventory;
import com.cdc.cowmanagement.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@CrossOrigin("*")
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Inventory> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Inventory save(@RequestBody Inventory inventory) {
        return service.save(inventory);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}