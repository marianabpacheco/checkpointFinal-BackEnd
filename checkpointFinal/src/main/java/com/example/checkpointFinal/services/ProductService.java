package com.example.checkpointFinal.services;

import com.example.checkpointFinal.entities.Product;
import com.example.checkpointFinal.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

    public List<Product> findByCategory(String category) {
        List<Product> list = repository.findAll();
        List<Product> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().getName().equals(category)){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

}
