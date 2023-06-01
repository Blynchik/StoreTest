package com.store.controller.monitor;

import com.store.controller.AbstractItemController;
import com.store.model.monitor.Monitor;
import com.store.service.monitor.MonitorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/monitor")
public class MonitorController extends AbstractItemController<Monitor, MonitorService> {

    public MonitorController(MonitorService itemService) {
        super(itemService);
    }
}