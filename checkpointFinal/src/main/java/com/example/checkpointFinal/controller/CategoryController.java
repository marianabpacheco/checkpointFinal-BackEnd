package com.example.checkpointFinal.controller;

import com.example.checkpointFinal.entities.Category;
import com.example.checkpointFinal.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> buscarTodos(){
        return ResponseEntity.ok(categoryService.buscarTodos());
    }
}