package com.agrotech.agromicroservice.controllers;

import com.agrotech.agromicroservice.entities.Empresas;
import com.agrotech.agromicroservice.entities.Facturas;
import com.agrotech.agromicroservice.services.EmpresasService;
import com.agrotech.agromicroservice.services.FacturasService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@RequiredArgsConstructor
public class FacturasController {

    private final FacturasService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Facturas> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Facturas findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Facturas facturasRequest){
        this.service.create(facturasRequest);
    }
}
