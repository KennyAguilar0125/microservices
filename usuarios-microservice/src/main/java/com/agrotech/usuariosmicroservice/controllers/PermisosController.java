package com.agrotech.usuariosmicroservice.controllers;

import com.agrotech.usuariosmicroservice.entities.Permisos;
import com.agrotech.usuariosmicroservice.services.PermisosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permisos")
@RequiredArgsConstructor
public class PermisosController {

    private final PermisosService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Permisos> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Permisos findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Permisos permisosRequest){
        this.service.create(permisosRequest);
    }
}
