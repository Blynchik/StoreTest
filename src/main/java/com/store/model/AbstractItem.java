package com.store.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    protected String serialNumber;

    @Column(name = "manufacturer")
    @NotBlank
    protected String manufacturer;

    @Column(name = "price")
    @Min(value = 0, message = "Price should be 0 or greater")
    protected Integer price;

    @Column(name = "amount")
    @Min(value = 0, message = "Amount should be 0 or greater")
    protected Integer amount;
}
