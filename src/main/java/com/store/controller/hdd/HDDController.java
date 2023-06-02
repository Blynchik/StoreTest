package com.store.controller.hdd;

import com.store.controller.AbstractItemController;
import com.store.exception.ItemNotFoundException;
import com.store.model.computer.Computer;
import com.store.model.hdd.HDD;
import com.store.service.hdd.HDDService;
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
@RequestMapping("/api/hdd")
public class HDDController extends AbstractItemController<HDD, HDDService> {

    public HDDController(HDDService itemService) {
        super(itemService);
    }

    @Override
    protected void checkExistence(Optional<HDD> item, Long id) {

        if(item.isEmpty()){
            throw new ItemNotFoundException(HDD.class, id);
        }
    }
}
