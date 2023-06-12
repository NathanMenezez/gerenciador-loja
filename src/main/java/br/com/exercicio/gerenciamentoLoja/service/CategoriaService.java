package br.com.exercicio.gerenciamentoLoja.service;

import br.com.exercicio.gerenciamentoLoja.model.dto.CategoriaDto;
import br.com.exercicio.gerenciamentoLoja.model.dto.Mensagem;
import br.com.exercicio.gerenciamentoLoja.model.entities.Category;
import br.com.exercicio.gerenciamentoLoja.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public ResponseEntity<?> cadastrarCategoria(CategoriaDto categoriaDto) {
        if(categoriaRepository.existsByNome(categoriaDto.getNome())){
            return ResponseEntity.status(400).body(new Mensagem("Categoria já cadastrada!"));
        }
        return ResponseEntity.status(201).body(categoriaRepository.save(new Category(categoriaDto.getNome().toUpperCase())));
    }
}
