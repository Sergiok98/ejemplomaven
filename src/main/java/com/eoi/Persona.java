package com.eoi;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
@Data
public class Persona {
    public Persona() {
    }
    private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
    private	LocalDate fechaNacimiento;
}