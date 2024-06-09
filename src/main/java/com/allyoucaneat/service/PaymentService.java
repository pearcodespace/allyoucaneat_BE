package com.allyoucaneat.service;

import com.stripe.exception.StripeException;
import com.allyoucaneat.model.Order;
import com.allyoucaneat.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
