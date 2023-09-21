package com.agrotech.usuariosmicroservice.services;

import com.agrotech.usuariosmicroservice.entities.Roles;
import com.agrotech.usuariosmicroservice.repositories.RolesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RolesService {

    private final RolesRepository repository;

    public void create(Roles roles) {
        if(roles.getId() == null){
            roles.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        roles.setActualizadoEn(new Timestamp(System.currentTimeMillis()));
        repository.save(roles);

        log.info("Roles added: {}", roles);
    }
    public List<Roles> findAll(){return repository.findAll(Sort.by("id").ascending());}
    public Roles findOne(Long id) {
        return repository.findById(id).orElse(null);
    }
}
