package com.simecc.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simecc.backend.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
