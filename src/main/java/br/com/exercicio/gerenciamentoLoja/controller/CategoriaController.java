package br.com.exercicio.gerenciamentoLoja.controller;

import br.com.exercicio.gerenciamentoLoja.model.dto.CategoriaDto;
import br.com.exercicio.gerenciamentoLoja.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrarCategoria(@RequestBody @Valid CategoriaDto categoriaDto){
        return service.cadastrarCategoria(categoriaDto);
    }

}
