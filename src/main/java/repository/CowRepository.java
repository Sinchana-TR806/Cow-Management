package com.cdc.cowmanagement.repository;

import com.cdc.cowmanagement.model.Cow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CowRepository extends JpaRepository<Cow, Long> {
}