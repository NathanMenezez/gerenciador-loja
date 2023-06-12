package br.com.exercicio.gerenciamentoLoja.model.entities;

import br.com.exercicio.gerenciamentoLoja.model.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date dataCriacao = new Date();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusPedido status = StatusPedido.PENDENTE;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPedido")
    private List<OrderItem> itens = new ArrayList<>();

}
