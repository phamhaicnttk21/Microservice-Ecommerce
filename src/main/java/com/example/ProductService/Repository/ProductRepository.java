package com.example.ProductService.Repository;

import com.example.ProductService.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findProductById(Long id);
}
