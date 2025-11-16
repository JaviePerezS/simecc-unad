package com.simecc.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simecc.backend.entity.Actividad;

public interface ActividadRepository extends JpaRepository<Actividad, Long> {
}
