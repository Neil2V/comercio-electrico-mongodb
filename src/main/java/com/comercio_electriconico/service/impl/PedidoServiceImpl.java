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
        if (pedido.getId() == null) {
            return pedidoDao.save(pedido).then();
        } else {
            return pedidoDao.findById(pedido.getId())
                    .flatMap(existingPedido -> {
                        return pedidoDao.save(pedido).then();
                    })
                    .switchIfEmpty(Mono.defer(() -> {
                        return pedidoDao.save(pedido).then();
                    }));
        }
    }
}
