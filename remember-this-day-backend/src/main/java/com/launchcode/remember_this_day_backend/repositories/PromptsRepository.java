package com.launchcode.remember_this_day_backend.repositories;

import com.launchcode.remember_this_day_backend.models.Prompts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromptsRepository extends JpaRepository<Prompts, Integer> {
}
