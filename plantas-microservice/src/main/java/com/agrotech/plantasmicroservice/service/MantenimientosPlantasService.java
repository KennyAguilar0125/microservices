package com.agrotech.plantasmicroservice.service;

import com.agrotech.plantasmicroservice.entities.MantenimientosPlantas;
import com.agrotech.plantasmicroservice.repositories.MantenimientosPlantasRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class MantenimientosPlantasService {

    private final MantenimientosPlantasRepository repository;

    public List<MantenimientosPlantas> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public MantenimientosPlantas findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public MantenimientosPlantas create(MantenimientosPlantas mantenimientosPlantas) {
        return null;
        /*if(plaga.getId() == null){
            plaga.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        plaga.setActualizadoEn(new Timestamp(System.currentTimeMillis()));

        log.info("Mantenimiento added: {}", plaga);
        return repository.save(plaga);*/
    }
}
