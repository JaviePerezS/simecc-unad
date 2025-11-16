package com.simecc.backend.service;

import java.util.List;

import com.simecc.backend.entity.Multa;

public interface MultaService {

    Multa save(Multa multa);

    Multa update(Long id, Multa multa);

    List<Multa> findAll();

    Multa findById(Long id);

    void delete(Long id);
}
