package com.store.repository;

import com.store.model.hdd.HDD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HDDRepository extends JpaRepository<HDD, Long> {
}
