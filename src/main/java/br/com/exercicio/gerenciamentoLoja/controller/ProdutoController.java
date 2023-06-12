package br.com.exercicio.gerenciamentoLoja.controller;

import br.com.exercicio.gerenciamentoLoja.model.dto.ProdutoDto;
import br.com.exercicio.gerenciamentoLoja.model.entities.Product;
import br.com.exercicio.gerenciamentoLoja.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<Product> cadastrarProduto(@RequestBody @Valid ProdutoDto produtoDto){
        return service.cadastrarProduto(produtoDto);
    }
}
