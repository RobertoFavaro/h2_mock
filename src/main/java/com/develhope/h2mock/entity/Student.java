package com.develhope.h2mock.entity;

import jakarta.persistence.*;

@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lastName;
    private String firstName;
    @Column(unique = true)
    private String email;
}
