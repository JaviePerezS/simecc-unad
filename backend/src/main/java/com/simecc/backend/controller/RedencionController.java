package com.simecc.backend.controller;

import com.simecc.backend.entity.Redencion;
import com.simecc.backend.service.RedencionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
