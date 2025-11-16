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

import com.simecc.backend.entity.Curso;
import com.simecc.backend.service.CursoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CursoController {

    private final CursoService service;

    @GetMapping
    public List<Curso> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Curso get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Curso create(@RequestBody Curso c) { return service.save(c); }

    @PutMapping("/{id}")
    public Curso update(@PathVariable Long id, @RequestBody Curso c) {
        return service.update(id, c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}

