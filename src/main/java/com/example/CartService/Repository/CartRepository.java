package com.example.CartService.Repository;

import com.example.CartService.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartItem,Long> {

}
