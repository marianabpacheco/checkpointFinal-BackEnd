package com.example.checkpointFinal.services;

import com.example.checkpointFinal.entities.Category;
import com.example.checkpointFinal.entities.Product;
import com.example.checkpointFinal.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> buscarTodos(){
        return categoryRepository.findAll();
    }



}
