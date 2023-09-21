package com.agrotech.plantasmicroservice.repositories;

import com.agrotech.plantasmicroservice.entities.MantenimientosPlantas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenimientosPlantasRepository extends JpaRepository<MantenimientosPlantas, Long> {
}
