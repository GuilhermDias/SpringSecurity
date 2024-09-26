package com.example.SpringSecurity.Repositories;

import com.example.SpringSecurity.Domain.Produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
