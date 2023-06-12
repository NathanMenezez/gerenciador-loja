package br.com.exercicio.gerenciamentoLoja.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class PedidoDto {

    private List<ProdutoPedidoDto> produtos;
}
