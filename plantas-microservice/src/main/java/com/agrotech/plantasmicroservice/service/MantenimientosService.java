package com.agrotech.plantasmicroservice.service;

import com.agrotech.plantasmicroservice.entities.Mantenimientos;
import com.agrotech.plantasmicroservice.repositories.MantenimientosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class MantenimientosService {

    private final MantenimientosRepository repository;

    public List<Mantenimientos> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public Mantenimientos findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Mantenimientos create(Mantenimientos plaga) {
        if(plaga.getId() == null){
            plaga.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        plaga.setActualizadoEn(new Timestamp(System.currentTimeMillis()));

        log.info("Mantenimiento added: {}", plaga);
        return repository.save(plaga);
    }
}
