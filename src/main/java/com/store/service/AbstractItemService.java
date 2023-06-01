package com.store.service;

import com.store.model.AbstractItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public abstract class AbstractItemService<T extends AbstractItem, R extends JpaRepository<T, Long>> {

    protected final R repository;

    public AbstractItemService(R repository){
        this.repository = repository;
    }

    @Transactional
    public void add(T item){
        repository.save(item);
    }

    @Transactional
    public void update(Long id, T updatedItem){
        updatedItem.setId(id);
        repository.save(updatedItem);
    }

    public List<T> getAll(){
        return repository.findAll();
    }

    public Optional<T> getOne(Long id){
        return  repository.findById(id);
    }
}
