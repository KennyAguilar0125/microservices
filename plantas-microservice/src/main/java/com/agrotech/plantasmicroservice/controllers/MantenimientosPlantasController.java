package com.agrotech.plantasmicroservice.controllers;

import com.agrotech.plantasmicroservice.entities.MantenimientosPlantas;
import com.agrotech.plantasmicroservice.service.MantenimientosPlantasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mantenimientosPlantas")
@RequiredArgsConstructor
public class MantenimientosPlantasController {

    private final MantenimientosPlantasService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MantenimientosPlantas> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public MantenimientosPlantas findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MantenimientosPlantas create(@RequestBody MantenimientosPlantas mantenimientosRequest){
        return this.service.create(mantenimientosRequest);
    }
}
