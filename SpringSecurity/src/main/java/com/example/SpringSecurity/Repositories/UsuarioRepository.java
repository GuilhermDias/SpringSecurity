package com.example.SpringSecurity.Repositories;

import com.example.SpringSecurity.Domain.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {


}
