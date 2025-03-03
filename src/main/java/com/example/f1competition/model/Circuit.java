package com.example.f1competition.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "circuit")
@NoArgsConstructor
@AllArgsConstructor
public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;

    private Double length;

    private Integer numberOfLaps;
}
