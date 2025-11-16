package com.simecc.backend.service;

import com.simecc.backend.entity.Usuario;
import java.util.List;

public interface UsuarioService {

    Usuario save(Usuario usuario);

    Usuario update(Long id, Usuario usuario);

    List<Usuario> findAll();

    Usuario findById(Long id);

    void delete(Long id);
}
