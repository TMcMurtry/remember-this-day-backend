package com.launchcode.remember_this_day_backend.repositories;

import com.launchcode.remember_this_day_backend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}

