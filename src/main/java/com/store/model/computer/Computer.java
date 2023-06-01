package com.store.model.computer;

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
@Table(name = "computer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Computer extends AbstractItem {

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "form_factor",
            joinColumns = @JoinColumn(name = "id"))
    @Column(name = "form_factor")
    @JoinColumn
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private FormFactor formFactor;
}
