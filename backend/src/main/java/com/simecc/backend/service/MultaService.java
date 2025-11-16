package com.simecc.backend.service;

import com.simecc.backend.entity.Multa;
import java.util.List;

public interface MultaService {

    Multa save(Multa multa);

    Multa update(Long id, Multa multa);

    List<Multa> findAll();

    Multa findById(Long id);

    void delete(Long id);
}
