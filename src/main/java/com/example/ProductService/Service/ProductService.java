package com.example.ProductService.Service;

import com.example.ProductService.Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProduct();
    Product viewProduct(Long id);

}
