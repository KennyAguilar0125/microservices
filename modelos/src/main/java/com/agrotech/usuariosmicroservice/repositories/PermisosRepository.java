package com.agrotech.usuariosmicroservice.repositories;

import com.agrotech.usuariosmicroservice.entities.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisosRepository extends JpaRepository<Permisos, Long> {
}
