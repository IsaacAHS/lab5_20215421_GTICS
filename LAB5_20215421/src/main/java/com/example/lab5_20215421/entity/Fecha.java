package com.example.lab5_20215421.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Fechas")
public class Fecha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFechas")
    private int id;

    @Column(name="fechaDisponibilidad", nullable=false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="idProfesional")
    private Profesional profesional;
}
