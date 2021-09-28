package com.rudkin.restaurant_v2.repository;

import com.rudkin.restaurant_v2.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByCategory_Id(int id);

    List<Product> findAllByPrice(double price, Pageable pageable);
}
