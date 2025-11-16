package com.simecc.backend.controller;

import com.simecc.backend.entity.Certificado;
import com.simecc.backend.service.CertificadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certificados")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CertificadoController {

    private final CertificadoService service;

    @GetMapping
    public List<Certificado> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Certificado get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Certificado create(@RequestBody Certificado c) { return service.save(c); }

    @PutMapping("/{id}")
    public Certificado update(@PathVariable Long id, @RequestBody Certificado c) {
        return service.update(id, c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
