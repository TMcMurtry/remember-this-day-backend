package com.launchcode.remember_this_day_backend.controllers;

import com.launchcode.remember_this_day_backend.models.Categories;
import com.launchcode.remember_this_day_backend.repositories.CategoriesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    private final CategoriesRepository categoriesRepository;

    public CategoriesController(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @GetMapping
    public List<Categories> getAllItems() {
        return categoriesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Categories getItem(@PathVariable int id) {
        return categoriesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Categories addItem(@RequestBody Categories categories) {
        return categoriesRepository.save(categories);
    }

    @PutMapping("/{id}")
    public Categories updateItem(@PathVariable int id, @RequestBody Categories categories) {
        categories.setId(id);
        return categoriesRepository.save(categories);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        categoriesRepository.deleteById(id);
    }

}
