package com.example.community.controller;

/**
 * @Author: Joshua
 * @Date: 03/12/2023 22:01
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}