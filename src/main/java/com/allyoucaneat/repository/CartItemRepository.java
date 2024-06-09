package com.allyoucaneat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allyoucaneat.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
