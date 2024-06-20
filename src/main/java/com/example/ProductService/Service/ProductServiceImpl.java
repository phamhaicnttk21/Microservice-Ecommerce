package com.example.ProductService.Service;

import com.example.ProductService.Model.Product;
import com.example.ProductService.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product viewProduct(Long id) {
        return productRepository.findProductById(id);
    }
}
