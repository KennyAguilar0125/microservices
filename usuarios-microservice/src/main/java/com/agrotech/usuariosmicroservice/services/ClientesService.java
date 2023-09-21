package com.agrotech.usuariosmicroservice.services;

import com.agrotech.usuariosmicroservice.entities.Clientes;
import com.agrotech.usuariosmicroservice.repositories.ClientesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClientesService {

    private final ClientesRepository repository;

    public void create(Clientes clientes) {
        if(clientes.getId() == null){
            clientes.setCreadoEn(new Timestamp(System.currentTimeMillis()));
        }
        clientes.setActualizadoEn(new Timestamp(System.currentTimeMillis()));
        repository.save(clientes);

        log.info("Cliente added: {}", clientes);
    }
    public List<Clientes> findAll(){return repository.findAll(Sort.by("id").ascending());}
    public Clientes findOne(Long id) {
        return repository.findById(id).orElse(null);
    }
}
