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

import com.simecc.backend.entity.Actividad;
import com.simecc.backend.service.ActividadService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/actividades")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ActividadController {

    private final ActividadService service;

    @GetMapping
    public List<Actividad> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Actividad get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Actividad create(@RequestBody Actividad a) { return service.save(a); }

    @PutMapping("/{id}")
    public Actividad update(@PathVariable Long id, @RequestBody Actividad a) {
        return service.update(id, a);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}

