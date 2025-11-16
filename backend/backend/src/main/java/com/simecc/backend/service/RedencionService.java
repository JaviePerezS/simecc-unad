package com.simecc.backend.service;

import com.simecc.backend.entity.Redencion;
import java.util.List;

public interface RedencionService {

    Redencion save(Redencion redencion);

    Redencion update(Long id, Redencion redencion);

    List<Redencion> findAll();

    Redencion findById(Long id);

    void delete(Long id);
}
