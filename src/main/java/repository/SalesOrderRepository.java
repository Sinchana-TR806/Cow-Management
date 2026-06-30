package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository
        extends JpaRepository<SalesOrder, Long> {
}