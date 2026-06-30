package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}