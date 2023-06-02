package com.store.controller.monitor;

import com.store.controller.AbstractItemController;
import com.store.exception.NotFoundException;
import com.store.model.computer.Computer;
import com.store.model.monitor.Monitor;
import com.store.service.monitor.MonitorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/monitor")
public class MonitorController extends AbstractItemController<Monitor, MonitorService> {

    public MonitorController(MonitorService itemService) {
        super(itemService);
    }

    @Override
    protected void checkExistence(Optional<Monitor> item, Long id) {

        if(item.isEmpty()){
            throw new NotFoundException(Monitor.class, id);
        }
    }
}
