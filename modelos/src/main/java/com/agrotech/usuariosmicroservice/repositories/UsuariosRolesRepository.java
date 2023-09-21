package com.agrotech.usuariosmicroservice.repositories;

import com.agrotech.usuariosmicroservice.entities.UsuariosRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRolesRepository extends JpaRepository<UsuariosRoles, Long> {
}
