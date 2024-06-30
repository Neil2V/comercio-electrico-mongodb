package com.comercio_electriconico.service.impl;

import com.comercio_electriconico.dao.ProductoPedidoDao;
import com.comercio_electriconico.entity.ProductoPedido;
import com.comercio_electriconico.service.ProductoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ProductoPedidoServiceImpl implements ProductoPedidoService {

    @Autowired
    private ProductoPedidoDao productoPedidoDao;

    @Override
    public Flux<ProductoPedidoService> findById() {
        return null;
    }

    @Override
    public Mono<Void> guardarProductos(List<ProductoPedido> productoPedidos) {
        return Mono.empty();
    }
}
