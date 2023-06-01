package com.store.service;

import com.store.model.AbstractItem;

import java.util.List;

public interface AbstractItemService<T extends AbstractItem> {

    void add(T item);

    void update(Integer id, T updatedItem);

    List<T> getAll();

    T getOne(Integer id);
}
