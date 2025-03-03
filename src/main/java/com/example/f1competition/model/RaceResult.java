package com.example.f1competition.model;

import jakarta.persistence.*;

@Entity
public class RaceResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer position; // Finishing position

    private Integer points; // Points earned in the race

    private Boolean fastestLap; // Indicates if the driver got the fastest lap

    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    // Constructors, getters, and setters

    public RaceResult() {
    }

    public RaceResult(Integer position, Integer points, Boolean fastestLap, Race race, Driver driver) {
        this.position = position;
        this.points = points;
        this.fastestLap = fastestLap;
        this.race = race;
        this.driver = driver;
    }

    // Getters and setters...
}
