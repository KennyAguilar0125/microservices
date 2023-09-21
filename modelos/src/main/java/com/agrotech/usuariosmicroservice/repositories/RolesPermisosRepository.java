package com.agrotech.usuariosmicroservice.repositories;

import com.agrotech.usuariosmicroservice.entities.RolesPermisos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesPermisosRepository extends JpaRepository<RolesPermisos, Long> {
}
