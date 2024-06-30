package com.comercio_electriconico.controller;

import com.comercio_electriconico.entity.Pedido;
import com.comercio_electriconico.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping(path = "/registrar")
    public ResponseEntity<Mono<Void>> registro(@RequestBody Pedido pedido){
        return new ResponseEntity<>(pedidoService.registrarPedido(pedido), HttpStatus.OK);
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<Flux<Pedido>> findAll(){
        return new ResponseEntity<>(pedidoService.listaPedidos(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete/{id}")
    public Mono<ResponseEntity<Pedido>> eliminar(@PathVariable("id") String id){
        return pedidoService.eliminarPedido(id)
                .map(e -> new ResponseEntity<>(e, HttpStatus.OK))
                .switchIfEmpty(Mono.just(new ResponseEntity<>(HttpStatus.NOT_FOUND)));
    }
}
