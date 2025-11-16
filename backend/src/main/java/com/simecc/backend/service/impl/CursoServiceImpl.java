package com.simecc.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simecc.backend.entity.Curso;
import com.simecc.backend.repository.CursoRepository;
import com.simecc.backend.service.CursoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoService {

    private final CursoRepository repository;

    @Override
    public Curso save(Curso curso) {
        return repository.save(curso);
    }

    @Override
    public Curso update(Long id, Curso curso) {
        Curso found = findById(id);

        found.setNombre(curso.getNombre());
        found.setHoras(curso.getHoras());
        found.setPuntos(curso.getPuntos());

        return repository.save(found);
    }

    @Override
    public List<Curso> findAll() {
        return repository.findAll();
    }

    @Override
    public Curso findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
