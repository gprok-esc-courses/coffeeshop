package com.example.coffeeshop.repository;

import com.example.coffeeshop.model.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageRepository extends JpaRepository<Beverage, Long> {
}
