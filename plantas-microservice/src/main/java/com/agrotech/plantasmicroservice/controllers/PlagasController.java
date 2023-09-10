package com.agrotech.plantasmicroservice.controllers;

import com.agrotech.plantasmicroservice.entities.Plagas;
import com.agrotech.plantasmicroservice.entities.Plantas;
import com.agrotech.plantasmicroservice.service.PlagasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plagas")
@RequiredArgsConstructor
public class PlagasController {

    private final PlagasService plagasService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Plagas> findAll() {
        return this.plagasService.findAll();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Plagas findOne(@PathVariable Long id) {
        return this.plagasService.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Plagas create(@RequestBody Plagas plagasRequest){
        return this.plagasService.create(plagasRequest);
    }
}
