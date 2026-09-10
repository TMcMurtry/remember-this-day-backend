package com.launchcode.remember_this_day_backend.repositories;

import com.launchcode.remember_this_day_backend.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
