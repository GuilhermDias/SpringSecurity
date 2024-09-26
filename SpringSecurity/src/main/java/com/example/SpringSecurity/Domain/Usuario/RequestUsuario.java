package com.example.SpringSecurity.Domain.Usuario;

public record RequestUsuario(String login, String senha, Role permisao) {
}
