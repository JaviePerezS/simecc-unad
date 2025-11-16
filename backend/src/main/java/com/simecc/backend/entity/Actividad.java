package com.simecc.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_simecc_co_actividad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_actividad", nullable=false)
    private String nombre;

    private Integer puntos;

    private String tipo;
}
