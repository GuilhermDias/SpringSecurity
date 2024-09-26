package com.example.SpringSecurity.Domain.Produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ResquestProduto(@NotBlank String nome, @NotNull double preco, @NotNull Integer qtdEstoque) {
}
