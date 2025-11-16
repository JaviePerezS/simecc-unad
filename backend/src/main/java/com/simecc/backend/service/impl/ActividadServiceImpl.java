package com.simecc.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simecc.backend.entity.Actividad;
import com.simecc.backend.repository.ActividadRepository;
import com.simecc.backend.service.ActividadService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActividadServiceImpl implements ActividadService {

    private final ActividadRepository repository;

    @Override
    public Actividad save(Actividad actividad) {
        return repository.save(actividad);
    }

    @Override
    public Actividad update(Long id, Actividad actividad) {
        Actividad found = findById(id);

        found.setNombre(actividad.getNombre());
        found.setPuntos(actividad.getPuntos());
        found.setTipo(actividad.getTipo());

        return repository.save(found);
    }

    @Override
    public List<Actividad> findAll() {
        return repository.findAll();
    }

    @Override
    public Actividad findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Actividad no encontrada: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
