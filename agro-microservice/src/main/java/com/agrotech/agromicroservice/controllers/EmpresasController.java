package com.agrotech.agromicroservice.controllers;

import com.agrotech.agromicroservice.entities.Empresas;
import com.agrotech.agromicroservice.services.EmpresasService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
@RequiredArgsConstructor
public class EmpresasController {

    private final EmpresasService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Empresas> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Empresas findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Empresas empresasRequest){
        this.service.create(empresasRequest);
    }
}
