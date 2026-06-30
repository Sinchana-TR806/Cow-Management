package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.Inventory;
import com.cdc.cowmanagement.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository repository;

    public InventoryService(InventoryRepository repository) {
        this.repository = repository;
    }

    public List<Inventory> getAll() {
        return repository.findAll();
    }

    public Inventory save(Inventory inventory) {
        return repository.save(inventory);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}