package com.agrotech.usuariosmicroservice.services;

import com.agrotech.usuariosmicroservice.entities.Proveedores;
import com.agrotech.usuariosmicroservice.repositories.ProveedoresRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProveedoresService {

    private final ProveedoresRepository repository;

    public void create(Proveedores proveedores) {
        if(proveedores.getId() == null){
            proveedores.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        proveedores.setActualizadoEn(new Timestamp(System.currentTimeMillis()));
        repository.save(proveedores);

        log.info("Proveedores added: {}", proveedores);
    }
    public List<Proveedores> findAll(){return repository.findAll(Sort.by("id").ascending());}
    public Proveedores findOne(Long id) {
        return repository.findById(id).orElse(null);
    }
}
