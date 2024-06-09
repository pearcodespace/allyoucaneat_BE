package com.allyoucaneat.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.allyoucaneat.Exception.CartException;
import com.allyoucaneat.Exception.OrderException;
import com.allyoucaneat.Exception.RestaurantException;
import com.allyoucaneat.Exception.UserException;
import com.allyoucaneat.model.Order;
import com.allyoucaneat.model.PaymentResponse;
import com.allyoucaneat.model.User;
import com.allyoucaneat.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
