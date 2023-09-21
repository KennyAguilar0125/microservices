package com.agrotech.agromicroservice.services;

import com.agrotech.agromicroservice.entities.Periocidades;
import com.agrotech.agromicroservice.repositories.PeriocidadesRepository;
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
public class PeriocidadesService {

    private final PeriocidadesRepository repository;

    public List<Periocidades> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public Periocidades findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Periocidades create(Periocidades periocidades) {
        log.info("Periocidades added: {}", periocidades);
        return repository.save(periocidades);
    }
}
