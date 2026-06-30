package com.sridairy.controller;

import com.sridairy.model.Feed;
import com.sridairy.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feed")
@CrossOrigin("*")
public class FeedController {

    @Autowired
    private FeedService service;

    @GetMapping
    public List<Feed> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Feed save(@RequestBody Feed feed) {
        return service.save(feed);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}