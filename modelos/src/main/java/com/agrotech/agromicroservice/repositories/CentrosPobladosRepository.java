package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.CentrosPoblados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentrosPobladosRepository extends JpaRepository<CentrosPoblados, Long> {
}
