package com.example.f1competition.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer year;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL)
    private List<Race> races;

    // Constructors, getters, and setters

    public Season() {
    }

    public Season(Integer year) {
        this.year = year;
    }

    // Getters and setters...
}
