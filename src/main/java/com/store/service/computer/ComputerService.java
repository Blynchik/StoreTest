package com.store.service.computer;

import com.store.model.computer.Computer;
import com.store.service.AbstractItemService;
import com.store.repository.ComputerRepository;
import org.springframework.stereotype.Service;

@Service
public class ComputerService extends AbstractItemService<Computer, ComputerRepository> {

    public ComputerService(ComputerRepository repository) {
        super(repository);
    }
}
