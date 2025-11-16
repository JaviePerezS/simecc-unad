package com.simecc.backend.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_simecc_co_redencion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Redencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="id_actividad")
    private Actividad actividad;

    private LocalDate fecha;
}
