package com.example.f1competition.model;

import jakarta.persistence.*;

@Entity
public class Circuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;

    private Double length; // in kilometers

    private Integer numberOfLaps;

    // Constructors, getters, and setters

    public Circuit() {
    }

    public Circuit(String name, String location, Double length, Integer numberOfLaps) {
        this.name = name;
        this.location = location;
        this.length = length;
        this.numberOfLaps = numberOfLaps;
    }

    // Getters and setters...
}
