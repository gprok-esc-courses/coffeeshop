package com.example.coffeeshop.controller;

import com.example.coffeeshop.model.Beverage;
import com.example.coffeeshop.model.User;
import com.example.coffeeshop.repository.BeverageRepository;
import com.example.coffeeshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ManagerController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BeverageRepository beverageRepository;

    @GetMapping("/manager/dashboard")
    public String manager_dashboard() {
        return "manager_dashboard";
    }

    @GetMapping("/manager/orders/by/staff")
    public String oders_by_staff(Model model) {
        List<User> staff = userRepository.findAllByRole("ROLE_STAFF");
        model.addAttribute("staff", staff);
        return "oders_by_staff";
    }

    @GetMapping("/manager/beverages")
    public String beverages(Model model) {
        List<Beverage> beverages = beverageRepository.findAll();
        model.addAttribute("beverages", beverages);

        return "manager_beverages";
    }
}
