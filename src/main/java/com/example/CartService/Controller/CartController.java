package com.example.CartService.Controller;

import com.example.CartService.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<String> addProductToCart(@RequestParam String userId, @RequestParam Long productId) {
        cartService.addProductToCart(userId, productId);
        return ResponseEntity.ok("Product added to cart successfully");
    }
}