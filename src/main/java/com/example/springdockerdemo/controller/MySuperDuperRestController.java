package com.example.springdockerdemo.controller;

import com.example.springdockerdemo.entity.User;
import com.example.springdockerdemo.repo.Repos;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class MySuperDuperRestController {
    private final Repos repos;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return repos.findById(id).orElse(null);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        repos.save(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        Optional<User> optionalUser = repos.findById(id);
        if (!optionalUser.isPresent()) {
            return "No such user!";
        }
        repos.delete(optionalUser.get());
        return "User deleted!";
    }
}
