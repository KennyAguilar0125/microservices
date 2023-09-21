package com.agrotech.usuariosmicroservice.controllers;

import com.agrotech.usuariosmicroservice.entities.Proveedores;
import com.agrotech.usuariosmicroservice.services.ProveedoresService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@RequiredArgsConstructor
public class ProveedoresController {

    private final ProveedoresService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Proveedores> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Proveedores findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Proveedores proveedoresRequest){
        this.service.create(proveedoresRequest);
    }
}
