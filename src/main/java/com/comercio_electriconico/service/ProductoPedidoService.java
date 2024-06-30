package com.comercio_electriconico.service;

import com.comercio_electriconico.entity.ProductoPedido;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ProductoPedidoService {

    Flux<ProductoPedidoService> findById();

    Mono<Void> guardarProductos(List<ProductoPedido> productoPedidos);
}
