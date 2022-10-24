package com.eoi;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString // para imprimir un objeto
@EqualsAndHashCode // para poder usar .equals
public class Person {
    private String nombre;
    private int edad;

}