package com.allyoucaneat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allyoucaneat.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
