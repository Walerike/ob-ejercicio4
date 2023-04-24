package com.example.obejercicio4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String hola(){
        return "Hola desde api rest";
    }
}
