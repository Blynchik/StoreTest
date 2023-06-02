package com.store.controller.computer;

import com.store.controller.AbstractItemController;
import com.store.exception.ItemNotFoundException;
import com.store.model.computer.Computer;
import com.store.service.computer.ComputerService;
import jakarta.validation.Valid;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/computer")
public class ComputerController extends AbstractItemController<Computer, ComputerService> {

    public ComputerController(ComputerService itemService) {
        super(itemService);
    }

    @Override
    protected void checkExistence(Optional<Computer> item, Long id) {

        if(item.isEmpty()){
            throw new ItemNotFoundException(Computer.class, id);
        }
    }
}
