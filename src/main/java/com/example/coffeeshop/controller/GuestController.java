package com.example.coffeeshop.controller;

import com.example.coffeeshop.dto.NewOrderDto;
import com.example.coffeeshop.model.Beverage;
import com.example.coffeeshop.model.Order;
import com.example.coffeeshop.repository.BeverageRepository;
import com.example.coffeeshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class GuestController {

    @Autowired
    private BeverageRepository beverageRepository;
    @Autowired
    private OrderRepository orderRepository;


    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/guest/order")
    public String guestOrder(Model model) {
        NewOrderDto orderDto = new NewOrderDto();
        model.addAttribute("orderDto", orderDto);
        List<Beverage> beverages = beverageRepository.findAll();
        model.addAttribute("beverages", beverages);
         return "guest_order";
    }

    @PostMapping("/guest/order")
    public String postGuestOrder(@ModelAttribute NewOrderDto orderDto, Model model) {
        // model.addAttribute("orderDto", orderDto);
        Optional<Beverage> optional = beverageRepository.findById(orderDto.getBeverageId());
        Beverage beverage = optional.get();
        Order order = new Order();
        order.setGuest(orderDto.getGuest());
        order.setBeverage(beverage);
        order.setCompleted(false);
        order.setDate_set(new Date());
        orderRepository.save(order);
        orderRepository.flush();
        model.addAttribute("order", order);
        return "order_no";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
