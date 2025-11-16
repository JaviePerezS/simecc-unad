package com.simecc.backend.service;

import java.util.List;

import com.simecc.backend.entity.Curso;

public interface CursoService {

    Curso save(Curso curso);

    Curso update(Long id, Curso curso);

    List<Curso> findAll();

    Curso findById(Long id);

    void delete(Long id);
}
