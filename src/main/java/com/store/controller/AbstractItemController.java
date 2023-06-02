package com.store.controller;

import com.store.exception.NotFoundException;
import com.store.model.AbstractItem;
import com.store.model.computer.Computer;
import com.store.service.AbstractItemService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/showAll")
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
    public void add(@RequestBody T item) {
        itemService.add(item);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id,
                       @RequestBody T updatedItem) {

        checkExistence(itemService.getOne(id), id);

        itemService.update(id, updatedItem);
    }

    protected abstract void checkExistence(Optional<T> item, Long id);
}
