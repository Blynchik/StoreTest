package com.store.controller;

import com.store.model.AbstractItem;
import com.store.service.AbstractItemService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class AbstractItemController
        <T extends AbstractItem, S extends AbstractItemService
                <T, ? extends JpaRepository<T, Long>>> {

    private final S itemService;

    public AbstractItemController(S itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/showAll")
    public List<T> showAll() {
        return itemService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<T> showOne(@PathVariable Long id) {
        return itemService.getOne(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody T item) {
        itemService.add(item);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id,
                       @RequestBody T updatedItem){
        itemService.update(id, updatedItem);
    }
}
