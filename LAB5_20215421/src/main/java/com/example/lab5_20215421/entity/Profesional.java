package com.example.lab5_20215421.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Profesionales")
public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProfesionales")
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String imagen;

    @Column(nullable = false)
    private String descrip;

    @ManyToOne
    @JoinColumn(name="Sedes")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name="Areas")
    private Area area;




}
