package com.example.checkpointFinal.controller;

import com.example.checkpointFinal.entities.Product;
import com.example.checkpointFinal.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> buscarTodos(){
        return ResponseEntity.ok(productService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> buscarPorId(@PathVariable Integer id) {
        Product product = productService.buscarPorId(id).orElse(null);
        return ResponseEntity.ok(product);
    }

}

