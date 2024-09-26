package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.Domain.Produto.Produto;
import com.example.SpringSecurity.Domain.Produto.ResquestProduto;
import com.example.SpringSecurity.Repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping("/v1/prod")
    public ResponseEntity postProduto(@RequestBody @Valid ResquestProduto data){
        Produto prod = new Produto(data);
        repository.save(prod);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/prod")
    public ResponseEntity getProduto(){
        var allProdutos = repository.findAll();
        return ResponseEntity.ok().body(allProdutos);
    }
}
