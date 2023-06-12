package br.com.exercicio.gerenciamentoLoja.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriaDto {
    @NotBlank
    private String nome;
}
