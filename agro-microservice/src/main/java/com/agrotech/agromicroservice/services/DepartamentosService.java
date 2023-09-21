package com.agrotech.agromicroservice.services;

import com.agrotech.agromicroservice.entities.Departamentos;
import com.agrotech.agromicroservice.repositories.DepartamentosRepository;
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
public class DepartamentosService {

    private final DepartamentosRepository repository;

    public List<Departamentos> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public Departamentos findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Departamentos create(Departamentos departamentos) {
        if(departamentos.getId() == null){
            departamentos.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        departamentos.setActualizadoEn(new Timestamp(System.currentTimeMillis()));

        log.info("Departamentos added: {}", departamentos);
        return repository.save(departamentos);
    }
}
