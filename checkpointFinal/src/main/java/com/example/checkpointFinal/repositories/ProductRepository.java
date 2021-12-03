package com.example.checkpointFinal.repositories;

import com.example.checkpointFinal.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

