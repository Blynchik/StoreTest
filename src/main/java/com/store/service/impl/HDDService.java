package com.store.service.impl;

import com.store.model.hdd.HDD;
import com.store.service.AbstractItemService;
import com.store.repository.HDDRepository;
import org.springframework.stereotype.Service;

@Service
public class HDDService extends AbstractItemService<HDD, HDDRepository> {

    public HDDService(HDDRepository repository) {
        super(repository);
    }
}
