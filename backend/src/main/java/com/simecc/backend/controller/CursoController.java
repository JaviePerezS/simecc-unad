package com.simecc.backend.controller;

import com.simecc.backend.entity.Curso;
import com.simecc.backend.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
