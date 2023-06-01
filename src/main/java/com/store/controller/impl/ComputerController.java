package com.store.controller.impl;

import com.store.controller.AbstractItemController;
import com.store.model.computer.Computer;
import com.store.service.impl.ComputerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/computer")
public class ComputerController extends AbstractItemController<Computer, ComputerService> {

    public ComputerController(ComputerService itemService) {
        super(itemService);
    }
}
