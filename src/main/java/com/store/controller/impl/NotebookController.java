package com.store.controller.impl;

import com.store.controller.AbstractItemController;
import com.store.model.notebook.Notebook;
import com.store.service.impl.NotebookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notebook")
public class NotebookController extends AbstractItemController<Notebook, NotebookService> {

    public NotebookController(NotebookService itemService) {
        super(itemService);
    }
}
