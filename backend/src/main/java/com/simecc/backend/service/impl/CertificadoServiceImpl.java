package com.simecc.backend.service.impl;

import com.simecc.backend.entity.Certificado;
import com.simecc.backend.repository.CertificadoRepository;
import com.simecc.backend.service.CertificadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CertificadoServiceImpl implements CertificadoService {

    private final CertificadoRepository repository;

    @Override
    public Certificado save(Certificado certificado) {
        return repository.save(certificado);
    }

    @Override
    public Certificado update(Long id, Certificado certificado) {
        Certificado found = findById(id);

        found.setFechaEmision(certificado.getFechaEmision());
        found.setUrl(certificado.getUrl());
        found.setUsuario(certificado.getUsuario());
        found.setRedencion(certificado.getRedencion());

        return repository.save(found);
    }

    @Override
    public List<Certificado> findAll() {
        return repository.findAll();
    }

    @Override
    public Certificado findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Certificado no encontrado: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
