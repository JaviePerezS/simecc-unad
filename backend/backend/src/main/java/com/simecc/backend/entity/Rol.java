package com.simecc.backend.entity;

import jakarta.persistence.*;
        import lombok.*;

@Entity
@Table(name = "t_simecc_co_rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_rol", nullable = false, length = 50)
    private String nombre;

    @Column(length = 200)
    private String descripcion;
}
