package com.agrotech.usuariosmicroservice.controllers;

import com.agrotech.usuariosmicroservice.entities.Roles;
import com.agrotech.usuariosmicroservice.services.RolesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RolesController {

    private final RolesService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Roles> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Roles findOne(@PathVariable Long id) {
        return this.service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Roles rolesRequest){
        this.service.create(rolesRequest);
    }
}
