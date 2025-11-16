package com.simecc.backend.service;

import java.util.List;

import com.simecc.backend.entity.Rol;

public interface RolService {

    Rol save(Rol rol);

    Rol update(Long id, Rol rol);

    List<Rol> findAll();

    Rol findById(Long id);

    void delete(Long id);
}
