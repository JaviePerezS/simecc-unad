package com.simecc.backend.service;

import java.util.List;

import com.simecc.backend.entity.Redencion;

public interface RedencionService {

    Redencion save(Redencion redencion);

    Redencion update(Long id, Redencion redencion);

    List<Redencion> findAll();

    Redencion findById(Long id);

    void delete(Long id);
}
