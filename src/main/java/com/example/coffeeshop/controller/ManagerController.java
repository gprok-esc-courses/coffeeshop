package com.example.coffeeshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {

    @GetMapping("/manager/dashboard")
    public String manager_dashboard() {
        return "manager_dashboard";
    }
}
