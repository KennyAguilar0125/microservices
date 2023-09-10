package com.agrotech.plantasmicroservice.repositories;

import com.agrotech.plantasmicroservice.entities.PlantasPlagas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantasPlagasRepository extends JpaRepository<PlantasPlagas, Long> {
}
