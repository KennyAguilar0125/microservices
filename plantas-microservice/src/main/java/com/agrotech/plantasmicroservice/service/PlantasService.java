package com.agrotech.plantasmicroservice.service;

import com.agrotech.plantasmicroservice.entities.Plantas;
import com.agrotech.plantasmicroservice.repositories.PlantasRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlantasService {

    private final PlantasRepository repository;

    public void create(Plantas planta) {
        planta.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        planta.setActualizadoEn(new Timestamp(System.currentTimeMillis()));
        repository.save(planta);

        log.info("Planta added: {}", planta);
    }

    public List<Plantas> findAll(){return repository.findAll(Sort.by("id").ascending());}

    public Plantas findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Plantas update(Plantas plantas){
        plantas.setActualizadoEn(new Timestamp(System.currentTimeMillis()));
        return repository.save(plantas);
    }

}
