package com.store.service.impl;

import com.store.model.monitor.Monitor;
import com.store.service.AbstractItemService;
import com.store.repository.MonitorRepository;
import org.springframework.stereotype.Service;

@Service
public class MonitorService extends AbstractItemService<Monitor, MonitorRepository> {

    public MonitorService(MonitorRepository repository) {
        super(repository);
    }
}
