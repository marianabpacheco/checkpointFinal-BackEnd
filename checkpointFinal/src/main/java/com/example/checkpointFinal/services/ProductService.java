package com.example.checkpointFinal.services;

import com.example.checkpointFinal.entities.Category;
import com.example.checkpointFinal.entities.Product;
import com.example.checkpointFinal.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> buscarTodos(){
        return productRepository.findAll();
    }

    public Optional<Product> buscarPorId(Integer id){
        return productRepository.findById(id);
    }
}
