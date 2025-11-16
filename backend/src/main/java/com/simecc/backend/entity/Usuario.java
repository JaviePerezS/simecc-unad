package com.simecc.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_simecc_co_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=80)
    private String nombre;

    @Column(nullable=false, length=20, unique=true)
    private String documento;

    @Column(nullable=false, length=100, unique=true)
    private String correo;

    @Column(nullable=false)
    private String contrasenia;

    @Column(length=20)
    private String telefono;

    @ManyToOne
    @JoinColumn(name="id_rol")
    private Rol rol;

    private Boolean estado = true;
}
