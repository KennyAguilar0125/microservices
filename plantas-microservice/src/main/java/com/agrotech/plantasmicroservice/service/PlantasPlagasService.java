package com.agrotech.plantasmicroservice.service;

import com.agrotech.plantasmicroservice.entities.PlantasPlagas;
import com.agrotech.plantasmicroservice.repositories.PlantasPlagasRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlantasPlagasService {

    private final PlantasPlagasRepository repository;

    public List<PlantasPlagas> findAll(){return repository.findAll(Sort.by("id").ascending());}

    public PlantasPlagas create(PlantasPlagas plantasPlagas) {
        log.info("Planta Plaga added: {}", plantasPlagas);
        return repository.save(plantasPlagas);
    }
}
