package com.simecc.backend.controller;

import com.simecc.backend.entity.Actividad;
import com.simecc.backend.service.ActividadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
