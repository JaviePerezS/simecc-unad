package com.simecc.backend.service.impl;

import com.simecc.backend.entity.Redencion;
import com.simecc.backend.repository.RedencionRepository;
import com.simecc.backend.service.RedencionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RedencionServiceImpl implements RedencionService {

    private final RedencionRepository repository;

    @Override
    public Redencion save(Redencion redencion) {
        return repository.save(redencion);
    }

    @Override
    public Redencion update(Long id, Redencion redencion) {
        Redencion found = findById(id);

        found.setFecha(redencion.getFecha());
        found.setActividad(redencion.getActividad());
        found.setUsuario(redencion.getUsuario());

        return repository.save(found);
    }

    @Override
    public List<Redencion> findAll() {
        return repository.findAll();
    }

    @Override
    public Redencion findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Redención no encontrada: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
