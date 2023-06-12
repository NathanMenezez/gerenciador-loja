package br.com.exercicio.gerenciamentoLoja.repository;

import br.com.exercicio.gerenciamentoLoja.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Order, Long> {
}
