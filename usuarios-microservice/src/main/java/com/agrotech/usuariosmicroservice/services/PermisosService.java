package com.agrotech.usuariosmicroservice.services;

import com.agrotech.usuariosmicroservice.entities.Permisos;
import com.agrotech.usuariosmicroservice.repositories.PermisosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PermisosService {

    private final PermisosRepository repository;

    public void create(Permisos permisos) {
        if(permisos.getId() == null){
            permisos.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        permisos.setActualizadoEn(new Timestamp(System.currentTimeMillis()));
        repository.save(permisos);

        log.info("Permisos added: {}", permisos);
    }
    public List<Permisos> findAll(){return repository.findAll(Sort.by("id").ascending());}
    public Permisos findOne(Long id) {
        return repository.findById(id).orElse(null);
    }
}
