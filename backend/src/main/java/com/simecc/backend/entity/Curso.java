package com.simecc.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_simecc_co_curso")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_curso", nullable=false)
    private String nombre;

    private Integer horas;

    @Column(name="puntos_equivalentes")
    private Integer puntos;
}
