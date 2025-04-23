package com.example.digital.inclusion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")
public class CategoryController {

    @GetMapping
    public String index(Model model) {
        return "categorias/index";
    }

    @GetMapping("/cadastrar")
    public String createCategory() {
        return "categorias/cadastrar";
    }
}
