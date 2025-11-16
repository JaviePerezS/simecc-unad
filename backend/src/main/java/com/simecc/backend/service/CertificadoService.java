package com.simecc.backend.service;

import java.util.List;

import com.simecc.backend.entity.Certificado;

public interface CertificadoService {

    Certificado save(Certificado certificado);

    Certificado update(Long id, Certificado certificado);

    List<Certificado> findAll();

    Certificado findById(Long id);

    void delete(Long id);
}
