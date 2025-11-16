package com.simecc.backend.controller;

import com.simecc.backend.entity.Multa;
import com.simecc.backend.service.MultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/multas")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MultaController {

    private final MultaService service;

    @GetMapping
    public List<Multa> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Multa get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Multa create(@RequestBody Multa m) { return service.save(m); }

    @PutMapping("/{id}")
    public Multa update(@PathVariable Long id, @RequestBody Multa m) {
        return service.update(id, m);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
