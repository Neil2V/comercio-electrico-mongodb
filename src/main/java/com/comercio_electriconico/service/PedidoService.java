package com.comercio_electriconico.service;

import com.comercio_electriconico.entity.Pedido;
import reactor.core.publisher.Mono;

public interface PedidoService {

    Mono<Void> registrarPedido(Pedido pedido);
}
