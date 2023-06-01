package com.store.repository;

import com.store.model.notebook.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotebookRepository extends JpaRepository<Notebook, Long> {
}
