package com.allyoucaneat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allyoucaneat.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
