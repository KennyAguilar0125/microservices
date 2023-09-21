package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long> {
}
