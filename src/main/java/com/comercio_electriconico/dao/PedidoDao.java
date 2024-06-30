package com.comercio_electriconico.dao;

import com.comercio_electriconico.entity.Pedido;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PedidoDao extends ReactiveMongoRepository<Pedido, Integer> {
}
