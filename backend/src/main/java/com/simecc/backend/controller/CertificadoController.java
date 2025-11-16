package com.simecc.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simecc.backend.entity.Certificado;
import com.simecc.backend.service.CertificadoService;

import lombok.RequiredArgsConstructor;

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
