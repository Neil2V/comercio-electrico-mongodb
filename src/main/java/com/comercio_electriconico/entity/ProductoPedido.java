package com.comercio_electriconico.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "productoPedido")
public class ProductoPedido {
    @Id
    private Integer id;
    private String nombre;
    private BigDecimal precio;
    private String descripcion;
    private String categoria;
    private Integer cantidad;
}
