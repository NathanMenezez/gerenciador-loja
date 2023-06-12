package br.com.exercicio.gerenciamentoLoja.model.dto;

import lombok.Data;

@Data
public class ProdutoPedidoDto {
    private Long idProduto;

    private Integer quantidade;
}
