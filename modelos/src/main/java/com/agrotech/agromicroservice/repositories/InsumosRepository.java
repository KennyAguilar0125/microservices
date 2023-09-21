package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Insumos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumosRepository extends JpaRepository<Insumos, Long> {
}
