package com.agrotech.agromicroservice.services;

import com.agrotech.agromicroservice.entities.Empresas;
import com.agrotech.agromicroservice.repositories.EmpresasRepository;
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
public class EmpresasService {

    private final EmpresasRepository repository;

    public List<Empresas> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public Empresas findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Empresas create(Empresas empresas) {
        log.info("Empresas added: {}", empresas);
        return repository.save(empresas);
    }
}
