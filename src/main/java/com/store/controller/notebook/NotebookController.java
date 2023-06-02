package com.store.controller.notebook;

import com.store.controller.AbstractItemController;
import com.store.exception.ItemNotFoundException;
import com.store.model.computer.Computer;
import com.store.model.notebook.Notebook;
import com.store.service.notebook.NotebookService;
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
@RequestMapping("/api/notebook")
public class NotebookController extends AbstractItemController<Notebook, NotebookService> {

    public NotebookController(NotebookService itemService) {
        super(itemService);
    }

    @Override
    protected void checkExistence(Optional<Notebook> item, Long id) {

        if(item.isEmpty()){
            throw new ItemNotFoundException(Notebook.class, id);
        }
    }
}
