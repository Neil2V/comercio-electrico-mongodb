package com.comercio_electriconico.dao;

import com.comercio_electriconico.entity.ProductoPedido;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoPedidoDao extends ReactiveMongoRepository<ProductoPedido, Integer> {
}
