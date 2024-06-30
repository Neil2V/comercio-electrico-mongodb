package com.comercio_electriconico.service.impl;

import com.comercio_electriconico.dao.PedidoDao;
import com.comercio_electriconico.entity.Pedido;
import com.comercio_electriconico.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoDao pedidoDao;

    @Override
    public Mono<Void> registrarPedido(Pedido pedido) {
        return null;
    }
}
