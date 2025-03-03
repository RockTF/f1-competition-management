package com.example.f1competition.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "circuit_id")
    private Circuit circuit;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @OneToMany(mappedBy = "race", cascade = CascadeType.ALL)
    private List<RaceResult> results;

    // Constructors, getters, and setters

    public Race() {
    }

    public Race(String name, LocalDate date, Circuit circuit, Season season) {
        this.name = name;
        this.date = date;
        this.circuit = circuit;
        this.season = season;
    }

    // Getters and setters...
}
