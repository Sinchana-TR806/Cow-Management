package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.MilkQuality;
import com.cdc.cowmanagement.repository.MilkQualityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilkQualityService {

    private final MilkQualityRepository repo;

    public MilkQualityService(MilkQualityRepository repo) {
        this.repo = repo;
    }

    public List<MilkQuality> getAll() {
        return repo.findAll();
    }

    public MilkQuality save(MilkQuality quality) {
        return repo.save(quality);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}