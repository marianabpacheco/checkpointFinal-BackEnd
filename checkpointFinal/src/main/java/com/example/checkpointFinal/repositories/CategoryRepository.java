package com.example.checkpointFinal.repositories;

import com.example.checkpointFinal.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
