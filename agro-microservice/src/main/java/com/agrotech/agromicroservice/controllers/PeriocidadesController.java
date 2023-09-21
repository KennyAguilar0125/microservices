package com.agrotech.agromicroservice.controllers;

import com.agrotech.agromicroservice.entities.Periocidades;
import com.agrotech.agromicroservice.services.PeriocidadesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/periocidades")
@RequiredArgsConstructor
public class PeriocidadesController {

    private final PeriocidadesService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Periocidades> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Periocidades findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Periocidades periocidadesRequest){
        this.service.create(periocidadesRequest);
    }
}
