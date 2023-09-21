package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Empresas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresasRepository extends JpaRepository<Empresas, Long> {
}
