package com.agrotech.usuariosmicroservice.repositories;

import com.agrotech.usuariosmicroservice.entities.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores, Long> {
}