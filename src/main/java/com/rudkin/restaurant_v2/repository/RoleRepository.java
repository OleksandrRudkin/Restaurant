package com.rudkin.restaurant_v2.repository;


import com.rudkin.restaurant_v2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
