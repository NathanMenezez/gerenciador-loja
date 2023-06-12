package br.com.exercicio.gerenciamentoLoja.controller;

import br.com.exercicio.gerenciamentoLoja.model.dto.PedidoDto;
import br.com.exercicio.gerenciamentoLoja.repository.PedidoRepository;
import br.com.exercicio.gerenciamentoLoja.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService service;

    @Autowired
    PedidoRepository repository;

    @PostMapping("/cadastar")
    public ResponseEntity<?> cadastrarPedido(@RequestBody PedidoDto pedidoDto){
        return service.cadastrarPedido(pedidoDto);
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        return ResponseEntity.status(200).body(repository.findAll());
    }
}
