package br.com.exercicio.gerenciamentoLoja.service;

import br.com.exercicio.gerenciamentoLoja.model.dto.ProdutoDto;
import br.com.exercicio.gerenciamentoLoja.model.entities.Product;
import br.com.exercicio.gerenciamentoLoja.repository.CategoriaRepository;
import br.com.exercicio.gerenciamentoLoja.repository.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    public ResponseEntity<Product> cadastrarProduto(ProdutoDto produtoDto) {
        Product produtoModel = new Product();
        BeanUtils.copyProperties(produtoDto, produtoModel);
        if(categoriaRepository.existsByNome(produtoDto.getNomeCategoria())){
            produtoModel.setCategoria(categoriaRepository.findByNome(produtoDto.getNomeCategoria()));
        }
        return ResponseEntity.status(201).body(produtoRepository.save(produtoModel));
    }
}
