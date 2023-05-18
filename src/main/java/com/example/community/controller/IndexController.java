package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Joshua
 * @Date: 2023/5/17 20:44
 */
@Controller
public class IndexController {
     @GetMapping("/")
    public String index()
     {
         return "index";
     }
}
