package com.cdc.cowmanagement.service;

import com.cdc.cowmanagement.model.Expense;
import com.cdc.cowmanagement.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAll() {
        return repository.findAll();
    }

    public Expense save(Expense expense) {
        return repository.save(expense);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}