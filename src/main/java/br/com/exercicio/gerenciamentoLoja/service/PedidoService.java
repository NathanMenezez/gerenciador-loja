package br.com.exercicio.gerenciamentoLoja.service;

import br.com.exercicio.gerenciamentoLoja.model.dto.PedidoDto;
import br.com.exercicio.gerenciamentoLoja.model.dto.ProdutoPedidoDto;
import br.com.exercicio.gerenciamentoLoja.model.entities.Order;
import br.com.exercicio.gerenciamentoLoja.model.entities.OrderItem;
import br.com.exercicio.gerenciamentoLoja.model.entities.Product;
import br.com.exercicio.gerenciamentoLoja.repository.PedidoRepository;
import br.com.exercicio.gerenciamentoLoja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    public ResponseEntity<?> cadastrarPedido(PedidoDto pedidoDto) {
        Order order = new Order();
        pedidoDto.getProdutos().forEach(element ->{
            if(produtoRepository.existsById(element.getIdProduto())){
                Product produto = produtoRepository.findById(element.getIdProduto()).get();
                order.getItens().add(new OrderItem(produto, element.getQuantidade(),produto.getPreco()));
            }
        });

        return ResponseEntity.status(201).body(pedidoRepository.save(order));
    }
}
