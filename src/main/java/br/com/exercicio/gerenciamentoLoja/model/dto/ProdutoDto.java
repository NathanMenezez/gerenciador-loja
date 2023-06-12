package br.com.exercicio.gerenciamentoLoja.model.dto;

import br.com.exercicio.gerenciamentoLoja.model.entities.Category;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProdutoDto {

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;

    @NotNull
    private Double preco;

    @NotNull
    private Integer quantidade;

    @NotBlank
    private String nomeCategoria;
}
