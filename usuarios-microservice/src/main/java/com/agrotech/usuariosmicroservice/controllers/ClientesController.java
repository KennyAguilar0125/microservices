package com.agrotech.usuariosmicroservice.controllers;

import com.agrotech.usuariosmicroservice.entities.Clientes;
import com.agrotech.usuariosmicroservice.services.ClientesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClientesController {

    private final ClientesService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Clientes> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Clientes findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Clientes clientesRequest){
        this.service.create(clientesRequest);
    }
}
