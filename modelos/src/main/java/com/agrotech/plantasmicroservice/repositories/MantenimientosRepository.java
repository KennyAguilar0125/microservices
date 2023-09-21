package com.agrotech.plantasmicroservice.repositories;

import com.agrotech.plantasmicroservice.entities.Mantenimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenimientosRepository extends JpaRepository<Mantenimientos, Long> {
}
