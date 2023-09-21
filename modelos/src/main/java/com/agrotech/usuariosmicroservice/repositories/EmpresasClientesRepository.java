package com.agrotech.usuariosmicroservice.repositories;

import com.agrotech.usuariosmicroservice.entities.EmpresasClientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresasClientesRepository extends JpaRepository<EmpresasClientes, Long> {
}
