package com.example.lab5_20215421.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Areas")
public class Area {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="idAreas")
    private int id;

    @Column(name="nombreArea")
    private String nombre;
}
