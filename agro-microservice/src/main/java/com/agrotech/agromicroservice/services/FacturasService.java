package com.agrotech.agromicroservice.services;

import com.agrotech.agromicroservice.entities.Facturas;
import com.agrotech.agromicroservice.repositories.FacturasRepository;
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
public class FacturasService {

    private final FacturasRepository repository;

    public List<Facturas> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public Facturas findOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Facturas create(Facturas facturas) {
        if(facturas.getId() == null){
            facturas.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        facturas.setActualizadoEn(new Timestamp(System.currentTimeMillis()));

        log.info("Facturas added: {}", facturas);
        return repository.save(facturas);
    }
}
