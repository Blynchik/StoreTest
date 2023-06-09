package com.store.model.monitor;

import com.store.model.AbstractItem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "monitor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Monitor extends AbstractItem {

    @Min(value = 5, message = "Should be greater then 4 inches")
    @Max(value = 105, message = "Should be less then 106 inches")
    @Column(name = "diagonal_inches")
    private Integer diagonalInches;
}
