package com.simecc.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simecc.backend.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
