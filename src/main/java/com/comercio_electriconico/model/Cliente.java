package com.comercio_electriconico.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Cliente {
    private Integer idCliente;
    private LocalDate fchRegistro;
    private String nombre;
    private String apellido;
    private String telefono;
    private String dni;
    private boolean nuevo;
}
