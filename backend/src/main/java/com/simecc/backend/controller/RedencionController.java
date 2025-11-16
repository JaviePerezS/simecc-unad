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

import com.simecc.backend.entity.Redencion;
import com.simecc.backend.service.RedencionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/redenciones")
@RequiredArgsConstructor
@CrossOrigin("*")
public class RedencionController {

    private final RedencionService service;

    @GetMapping
    public List<Redencion> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Redencion get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Redencion create(@RequestBody Redencion r) { return service.save(r); }

    @PutMapping("/{id}")
    public Redencion update(@PathVariable Long id, @RequestBody Redencion r) {
        return service.update(id, r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
