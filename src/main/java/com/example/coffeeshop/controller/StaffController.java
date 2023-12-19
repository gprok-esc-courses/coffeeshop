package com.example.coffeeshop.controller;


import com.example.coffeeshop.model.Order;
import com.example.coffeeshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Set;

@Controller
public class StaffController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/staff/dashboard")
    public String staff_dashboard() {
        return "staff_dashboard";
    }

    @GetMapping("/staff/orders")
    public String staff_orders(Model model) {
        List<Order> orders = orderRepository.findByCompleted(false);
        model.addAttribute("orders", orders);
        return "staff_orders";
    }
}
