package com.example.SpringSecurity.Domain.Produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private double preco;
    private Integer qtdEstoque;

    public Produto(ResquestProduto data) {
        this.nome = data.nome();
        this.preco = data.preco();
        this.qtdEstoque = data.qtdEstoque();
    }
}
