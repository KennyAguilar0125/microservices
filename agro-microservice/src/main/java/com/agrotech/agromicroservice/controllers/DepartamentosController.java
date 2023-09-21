package com.agrotech.agromicroservice.controllers;

import com.agrotech.agromicroservice.entities.Departamentos;
import com.agrotech.agromicroservice.services.DepartamentosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
@RequiredArgsConstructor
public class DepartamentosController {

    private final DepartamentosService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Departamentos> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Departamentos findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Departamentos departamentosRequest){
        this.service.create(departamentosRequest);
    }
}
