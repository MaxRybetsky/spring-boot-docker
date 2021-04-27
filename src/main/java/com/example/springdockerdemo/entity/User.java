package com.example.springdockerdemo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "uuu")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
