package com.sridairy.repository;

import com.sridairy.model.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository
        extends JpaRepository<Feed, Long> {
}