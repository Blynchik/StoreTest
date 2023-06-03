package com.store.model.hdd;

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
@Table(name = "hdd")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HDD extends AbstractItem {

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "hdd_capacity",
            joinColumns = @JoinColumn(name = "id"))
    @Column(name = "hdd_capacity")
    @JoinColumn
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private HDDCapacity capacity;

    public String getCapacity(){
        return capacity.getCapacity();
    }
}
