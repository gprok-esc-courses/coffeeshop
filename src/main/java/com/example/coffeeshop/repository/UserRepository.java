package com.example.coffeeshop.repository;

import com.example.coffeeshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    List<User> findAllByRole(String role);
}
