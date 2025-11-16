package com.simecc.backend.service;

import com.simecc.backend.entity.Rol;
import java.util.List;

public interface RolService {

    Rol save(Rol rol);

    Rol update(Long id, Rol rol);

    List<Rol> findAll();

    Rol findById(Long id);

    void delete(Long id);
}
