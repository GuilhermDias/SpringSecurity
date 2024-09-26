package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.Domain.Usuario.RequestUsuario;
import com.example.SpringSecurity.Domain.Usuario.Usuario;
import com.example.SpringSecurity.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/v1/{id}")
    public ResponseEntity getUsuarios(String id){
        var usuario = repository.findById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity postUsuarios(RequestUsuario dados){
        Usuario user = new Usuario(dados);
        repository.save(user);
        return ResponseEntity.ok().body(user);
    }

}
