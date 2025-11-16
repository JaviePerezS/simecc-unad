package com.simecc.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simecc.backend.entity.Multa;
import com.simecc.backend.repository.MultaRepository;
import com.simecc.backend.service.MultaService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MultaServiceImpl implements MultaService {

    private final MultaRepository repository;

    @Override
    public Multa save(Multa multa) {
        return repository.save(multa);
    }

    @Override
    public Multa update(Long id, Multa multa) {
        Multa found = findById(id);

        found.setValor(multa.getValor());
        found.setFecha(multa.getFecha());
        found.setDescripcion(multa.getDescripcion());
        found.setUsuario(multa.getUsuario());

        return repository.save(found);
    }

    @Override
    public List<Multa> findAll() {
        return repository.findAll();
    }

    @Override
    public Multa findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Multa no encontrada: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
