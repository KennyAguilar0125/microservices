package com.agrotech.plantasmicroservice.controllers;

import com.agrotech.plantasmicroservice.entities.PlantasPlagas;
import com.agrotech.plantasmicroservice.service.PlantasPlagasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plantasPlagas")
@RequiredArgsConstructor
public class PlantasPlagasController {

    private final PlantasPlagasService plantasPlagasService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PlantasPlagas> findAll() {
        return this.plantasPlagasService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PlantasPlagas addPlanta(@RequestBody PlantasPlagas plantasPlagasRequest){
        return this.plantasPlagasService.create(plantasPlagasRequest);
    }
}
