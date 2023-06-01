package com.store.model.notebook;

import com.store.model.AbstractItem;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "notebook")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notebook extends AbstractItem {

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "notebook_size",
            joinColumns = @JoinColumn(name = "id"))
    @Column(name = "notebook")
    @JoinColumn
    @NotNull
    @OnDelete(action = OnDeleteAction.CASCADE)
    private NotebookSize inches;
}
