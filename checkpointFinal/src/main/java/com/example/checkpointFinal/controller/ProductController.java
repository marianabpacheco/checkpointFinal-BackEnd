package com.example.checkpointFinal.controller;

//import com.example.checkpointFinal.config.TestConfig;
import com.example.checkpointFinal.entities.Product;
import com.example.checkpointFinal.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/categories/name/{category}")
    public ResponseEntity<List<Product>> findbyCategory(@PathVariable String category){
        List<Product> list = service.findByCategory(category);
        return ResponseEntity.ok().body(list);
    }

}

