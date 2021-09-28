package com.rudkin.restaurant_v2.repository;

import com.rudkin.restaurant_v2.model.OrderProduct;
import com.rudkin.restaurant_v2.model.OrderProductPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductPK> {

}
