package com.store.controller.notebook;

import com.store.controller.AbstractItemController;
import com.store.exception.NotFoundException;
import com.store.model.computer.Computer;
import com.store.model.notebook.Notebook;
import com.store.service.notebook.NotebookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/notebook")
public class NotebookController extends AbstractItemController<Notebook, NotebookService> {

    public NotebookController(NotebookService itemService) {
        super(itemService);
    }

    @Override
    protected void checkExistence(Optional<Notebook> item, Long id) {

        if(item.isEmpty()){
            throw new NotFoundException(Notebook.class, id);
        }
    }
}
