package com.allyoucaneat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allyoucaneat.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
