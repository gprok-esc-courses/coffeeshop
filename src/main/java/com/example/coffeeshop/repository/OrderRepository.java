package com.example.coffeeshop.repository;

import com.example.coffeeshop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCompleted(Boolean state);
}
