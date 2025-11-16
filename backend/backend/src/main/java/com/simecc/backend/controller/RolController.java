package com.simecc.backend.controller;

import com.simecc.backend.entity.Rol;
import com.simecc.backend.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
@CrossOrigin("*")
public class RolController {

    private final RolService service;

    @GetMapping
    public List<Rol> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Rol get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Rol create(@RequestBody Rol rol) { return service.save(rol); }

    @PutMapping("/{id}")
    public Rol update(@PathVariable Long id, @RequestBody Rol rol) {
        return service.update(id, rol);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
