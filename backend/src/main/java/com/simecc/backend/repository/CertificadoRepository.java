package com.simecc.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simecc.backend.entity.Certificado;

public interface CertificadoRepository extends JpaRepository<Certificado, Long> {
}
