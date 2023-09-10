package com.agrotech.plantasmicroservice.controllers;

import com.agrotech.plantasmicroservice.entities.Plantas;
import com.agrotech.plantasmicroservice.service.PlantasService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plantas")
@RequiredArgsConstructor
public class PlantasController {

    private final PlantasService plantasService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Plantas> findAll() {
        return this.plantasService.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Plantas findOne(@PathVariable Long id) {
        return this.plantasService.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Plantas plantasRequest){
        this.plantasService.create(plantasRequest);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody @Valid Plantas plantasRequest){
        this.plantasService.update(plantasRequest);
    }
}
