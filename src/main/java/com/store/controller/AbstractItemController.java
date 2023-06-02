package com.store.controller;

import com.store.model.AbstractItem;
import com.store.service.AbstractItemService;
import jakarta.validation.Valid;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class AbstractItemController
        <T extends AbstractItem, S extends AbstractItemService
                <T, ? extends JpaRepository<T, Long>>> {

    protected final S itemService;

    public AbstractItemController(S itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<T>> getAll() {
        return ResponseEntity.ok(itemService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getOne(@PathVariable Long id) {

        Optional<T> item = itemService.getOne(id);

        checkExistence(item, id);

        return ResponseEntity.ok().body(item.get());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody T item,
                                 BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    bindingResult.getAllErrors().stream()
                            .map(DefaultMessageSourceResolvable::getDefaultMessage));
        }

        itemService.add(item);

        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                       @Valid @RequestBody T updatedItem,
                       BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    bindingResult.getAllErrors().stream()
                            .map(DefaultMessageSourceResolvable::getDefaultMessage));
        }

        checkExistence(itemService.getOne(id), id);

        itemService.update(id, updatedItem);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    protected abstract void checkExistence(Optional<T> item, Long id);
}
