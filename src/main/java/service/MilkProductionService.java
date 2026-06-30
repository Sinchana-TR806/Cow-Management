package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.MilkProduction;
import com.cdc.cowmanagement.repository.MilkProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilkProductionService {

    @Autowired
    private MilkProductionRepository repository;

    public List<MilkProduction> getAll() {
        return repository.findAll();
    }

    public MilkProduction save(MilkProduction milk) {
        return repository.save(milk);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}