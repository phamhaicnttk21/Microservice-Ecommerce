package com.example.CartService.Service;

import com.example.CartService.Model.CartItem;
import com.example.CartService.Model.Product;
import com.example.CartService.ProductClient;
import com.example.CartService.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductClient productClient;

    public void addProductToCart(String userId, Long productId) {
        // Call the Product Service to verify the product exists
        Product product = productClient.getProductById(productId);
        if (product != null) {
            // Add product to cart
            CartItem cartItem = new CartItem();
            cartItem.setUserId(userId);
            cartItem.setProductId(productId);
            cartItem.setProductName(product.getProductName());
            cartItem.setProductPrice(product.getPrice());
            cartRepository.save(cartItem);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
