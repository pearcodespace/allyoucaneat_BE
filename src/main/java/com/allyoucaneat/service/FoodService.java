package com.allyoucaneat.service;

import java.util.List;

import com.allyoucaneat.Exception.FoodException;
import com.allyoucaneat.Exception.RestaurantException;
import com.allyoucaneat.model.Category;
import com.allyoucaneat.model.Food;
import com.allyoucaneat.model.Restaurant;
import com.allyoucaneat.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
