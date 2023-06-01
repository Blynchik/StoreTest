package com.store.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "serial_number")
    protected String serialNumber;

    @Column(name = "manufacturer")
    protected String manufacturer;

    @Column(name = "price")
    protected Integer price;

    @Column(name = "amount")
    protected Integer amount;
}
