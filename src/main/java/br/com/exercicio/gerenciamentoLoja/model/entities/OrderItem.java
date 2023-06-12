package br.com.exercicio.gerenciamentoLoja.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_pedido")
@Data
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Product produto;

    private Integer quantidade;

    private Double precoProduto;

    public OrderItem(Product produto, Integer quantidade, Double precoProduto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoProduto = precoProduto;
    }
}
