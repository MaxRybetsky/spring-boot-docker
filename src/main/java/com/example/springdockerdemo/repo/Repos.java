package com.example.springdockerdemo.repo;

import com.example.springdockerdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repos extends JpaRepository<User, Long> {
}
