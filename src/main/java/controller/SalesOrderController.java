package com.cdc.cowmanagement.controller;

import com.cdc.cowmanagement.model.SalesOrder;
import com.cdc.cowmanagement.service.SalesOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
@CrossOrigin("*")
public class SalesOrderController {

    private final SalesOrderService service;

    public SalesOrderController(SalesOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesOrder> getAll() {
        return service.getAll();
    }

    @PostMapping
    public SalesOrder save(@RequestBody SalesOrder order) {
        return service.save(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}