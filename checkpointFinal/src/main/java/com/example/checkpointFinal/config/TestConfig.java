package com.example.checkpointFinal.config;

import com.example.checkpointFinal.entities.Category;
import com.example.checkpointFinal.entities.Product;
import com.example.checkpointFinal.repositories.CategoryRepository;
import com.example.checkpointFinal.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") // Essa interface que cria sem precisar ir no H2
public class TestConfig implements CommandLineRunner {


    @Autowired
    private  ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

//    public static Integer totalCategories = 0;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = instanciaDeCategory( "notebooks");
        Category cat2 = instanciaDeCategory( "computadores");
        Category cat3 = instanciaDeCategory( "celulares");
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product p1 = new Product(null, "notebook gamer",  3000.00, "Notebook padrão intel", "notebook.png", cat1);
        Product p2 = new Product(null, "pc gamer", 6000.00,"pc padrão amd",  "pc.png", cat2);
        Product p3 = new Product(null, "redmi 9", 2000.00, "celular xiaomi", "xiaomi.png", cat3);
        productRepository.saveAll(Arrays.asList(p1, p2, p3));

    }

    public Category instanciaDeCategory(String name) {
//        totalCategories += 1;
        return new Category(null, name);
    }

}
