package br.com.exercicio.gerenciamentoLoja.repository;

import br.com.exercicio.gerenciamentoLoja.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Product, Long> {
}
