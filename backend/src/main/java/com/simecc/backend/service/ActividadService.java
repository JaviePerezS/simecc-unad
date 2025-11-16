package com.simecc.backend.service;

import com.simecc.backend.entity.Actividad;
import java.util.List;

public interface ActividadService {

    Actividad save(Actividad actividad);

    Actividad update(Long id, Actividad actividad);

    List<Actividad> findAll();

    Actividad findById(Long id);

    void delete(Long id);
}
