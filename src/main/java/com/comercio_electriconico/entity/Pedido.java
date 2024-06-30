package com.comercio_electriconico.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "pedido")
public class Pedido {
    @Id
    private String id;
    private String estado;
    private Integer idCliente;
    private List<ProductoPedido> productos;
    private Integer total;
    private LocalDate fchRegistro;
}
