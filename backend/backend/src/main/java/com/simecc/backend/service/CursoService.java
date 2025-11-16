package com.simecc.backend.service;

import com.simecc.backend.entity.Curso;
import java.util.List;

public interface CursoService {

    Curso save(Curso curso);

    Curso update(Long id, Curso curso);

    List<Curso> findAll();

    Curso findById(Long id);

    void delete(Long id);
}
