package com.example.f1competition.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String base; // Headquarters or base location

    private String teamPrincipal; // Name of the team principal

    @OneToMany(mappedBy = "team")
    private List<Driver> drivers;

    // Constructors, getters, and setters

    public Team() {
    }

    public Team(String name, String base, String teamPrincipal) {
        this.name = name;
        this.base = base;
        this.teamPrincipal = teamPrincipal;
    }

    // Getters and setters...
}
