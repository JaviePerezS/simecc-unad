package com.simecc.backend.controller;

import com.simecc.backend.entity.Usuario;
import com.simecc.backend.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping
    public List<Usuario> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Usuario get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Usuario create(@RequestBody Usuario u) { return service.save(u); }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario u) {
        return service.update(id, u);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
