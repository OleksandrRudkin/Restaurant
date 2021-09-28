package com.rudkin.restaurant_v2.repository;

import com.rudkin.restaurant_v2.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
