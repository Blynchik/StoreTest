package com.store.controller.impl;

import com.store.controller.AbstractItemController;
import com.store.model.hdd.HDD;
import com.store.service.impl.HDDService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hdd")
public class HDDController extends AbstractItemController<HDD, HDDService> {

    public HDDController(HDDService itemService) {
        super(itemService);
    }
}
