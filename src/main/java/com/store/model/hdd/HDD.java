package com.store.model.hdd;

import com.store.model.AbstractItem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hdd")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HDD extends AbstractItem {

    HDDCapacity capacity;
}
