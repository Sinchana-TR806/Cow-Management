package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}