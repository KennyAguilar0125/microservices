package com.agrotech.plantasmicroservice.service;

import com.agrotech.plantasmicroservice.entities.Plagas;
import com.agrotech.plantasmicroservice.entities.Plantas;
import com.agrotech.plantasmicroservice.repositories.PlagasRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class PlagasService {

    private final PlagasRepository repository;

    public List<Plagas> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public Plagas findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Plagas create(Plagas plaga) {
        plaga.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        plaga.setActualizadoEn(new Timestamp(System.currentTimeMillis()));

        log.info("Plaga added: {}", plaga);
        return repository.save(plaga);
    }
}
