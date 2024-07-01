package com.comercio_electriconico.service;

import com.comercio_electriconico.entity.Pedido;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PedidoService {

    Mono<Void> registrarPedido(Pedido pedido);

    Flux<Pedido> listaPedidos();

    Mono<Pedido> eliminarPedido(String id);

    Mono<Pedido> actualizarPedido(Pedido pedido);


}
