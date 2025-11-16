package com.simecc.backend.service;

import java.util.List;

import com.simecc.backend.entity.Usuario;

public interface UsuarioService {

    Usuario save(Usuario usuario);

    Usuario update(Long id, Usuario usuario);

    List<Usuario> findAll();

    Usuario findById(Long id);

    void delete(Long id);
}
