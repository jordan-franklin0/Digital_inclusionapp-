package com.example.digital.inclusion.controller;

import com.example.digital.inclusion.model.Category;
import com.example.digital.inclusion.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/categorias")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("categorias", categoryService.getAllCategories());
        return "categorias/index";
    }

    @GetMapping("/cadastrar")
    public String createCategory() {
        return "categorias/cadastrar";
    }

    @PostMapping("/salvar")
    public String saveCategory(@RequestParam String name) {
        Category category = new Category();
        category.setName(name);
        categoryService.saveCategory(category);
        return "redirect:/categorias";
    }
}
