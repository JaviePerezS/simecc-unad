package com.simecc.backend.service.impl;

import com.simecc.backend.entity.Usuario;
import com.simecc.backend.repository.UsuarioRepository;
import com.simecc.backend.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Usuario update(Long id, Usuario usuario) {
        Usuario found = findById(id);

        found.setNombre(usuario.getNombre());
        found.setCorreo(usuario.getCorreo());
        found.setTelefono(usuario.getTelefono());
        found.setEstado(usuario.getEstado());
        found.setRol(usuario.getRol());

        return repository.save(found);
    }

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
