package com.quantum.leap.manytoone.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @Column(name = "edad", nullable = false, unique = true)
    private Integer edad;

    @ManyToOne()
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;
}
