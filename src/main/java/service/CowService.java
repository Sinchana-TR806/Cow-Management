package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.Cow;
import com.cdc.cowmanagement.repository.CowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CowService {

    @Autowired
    private CowRepository repository;

    public List<Cow> getAllCows() {
        return repository.findAll();
    }

    public Cow saveCow(Cow cow) {
        return repository.save(cow);
    }

    public void deleteCow(Long id) {
        repository.deleteById(id);
    }
}
