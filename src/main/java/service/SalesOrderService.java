package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.SalesOrder;
import com.cdc.cowmanagement.repository.SalesOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesOrderService {

    private final SalesOrderRepository repository;

    public SalesOrderService(SalesOrderRepository repository) {
        this.repository = repository;
    }

    public List<SalesOrder> getAll() {
        return repository.findAll();
    }

    public SalesOrder save(SalesOrder order) {
        return repository.save(order);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}