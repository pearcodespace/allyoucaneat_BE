package com.allyoucaneat.service;

import java.util.List;

import com.allyoucaneat.model.Notification;
import com.allyoucaneat.model.Order;
import com.allyoucaneat.model.Restaurant;
import com.allyoucaneat.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
