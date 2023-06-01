package com.store.repository;

import com.store.model.monitor.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}
