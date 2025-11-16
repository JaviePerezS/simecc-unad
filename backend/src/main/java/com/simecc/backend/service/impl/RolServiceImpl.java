package com.simecc.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simecc.backend.entity.Rol;
import com.simecc.backend.repository.RolRepository;
import com.simecc.backend.service.RolService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RolServiceImpl implements RolService {

    private final RolRepository repository;

    @Override
    public Rol save(Rol rol) {
        return repository.save(rol);
    }

    @Override
    public Rol update(Long id, Rol rol) {
        Rol found = findById(id);

        found.setNombre(rol.getNombre());
        found.setDescripcion(rol.getDescripcion());

        return repository.save(found);
    }

    @Override
    public List<Rol> findAll() {
        return repository.findAll();
    }

    @Override
    public Rol findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
