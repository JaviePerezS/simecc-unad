package com.simecc.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simecc.backend.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
