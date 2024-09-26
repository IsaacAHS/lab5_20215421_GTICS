package com.example.lab5_20215421.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Sedes")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSedes")
    private int id;

    @Column(name="nombreSede", nullable=false)
    private String nombre;



}
