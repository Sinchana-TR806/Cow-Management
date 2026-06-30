package com.sridairy.service;

import com.sridairy.model.Feed;
import com.sridairy.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedService {

    @Autowired
    private FeedRepository repository;

    public List<Feed> getAll() {
        return repository.findAll();
    }

    public Feed save(Feed feed) {
        return repository.save(feed);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}