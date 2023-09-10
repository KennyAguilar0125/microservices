package com.agrotech.plantasmicroservice.repositories;

import com.agrotech.plantasmicroservice.entities.Plantas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantasRepository extends JpaRepository<Plantas, Long> {
}
