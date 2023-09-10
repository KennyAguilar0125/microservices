package com.agrotech.agromicroservice.controllers;

import com.agrotech.agromicroservice.dtos.CultivosRequest;
import com.agrotech.agromicroservice.entities.Cultivos;
import com.agrotech.agromicroservice.services.CultivosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cultivos")
@RequiredArgsConstructor
public class CultivosController {

    private final CultivosService cultivosService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cultivos> findAll() {
        return this.cultivosService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPlanta(@RequestBody CultivosRequest cultivosRequest){
        this.cultivosService.create(cultivosRequest);
    }
}
