package com.agrotech.plantasmicroservice.controllers;

import com.agrotech.plantasmicroservice.entities.Mantenimientos;
import com.agrotech.plantasmicroservice.entities.Plagas;
import com.agrotech.plantasmicroservice.service.MantenimientosService;
import com.agrotech.plantasmicroservice.service.PlagasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mantenimientos")
@RequiredArgsConstructor
public class MantenimientosController {

    private final MantenimientosService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Mantenimientos> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Mantenimientos findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mantenimientos create(@RequestBody Mantenimientos mantenimientosRequest){
        return this.service.create(mantenimientosRequest);
    }
}
