package com.allyoucaneat.service;

import com.allyoucaneat.Exception.CartException;
import com.allyoucaneat.Exception.CartItemException;
import com.allyoucaneat.Exception.FoodException;
import com.allyoucaneat.Exception.UserException;
import com.allyoucaneat.model.Cart;
import com.allyoucaneat.model.CartItem;
import com.allyoucaneat.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}