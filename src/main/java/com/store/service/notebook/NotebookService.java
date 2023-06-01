package com.store.service.notebook;

import com.store.model.notebook.Notebook;
import com.store.service.AbstractItemService;
import com.store.repository.NotebookRepository;
import org.springframework.stereotype.Service;

@Service
public class NotebookService extends AbstractItemService<Notebook, NotebookRepository> {

    public NotebookService(NotebookRepository repository) {
        super(repository);
    }
}
