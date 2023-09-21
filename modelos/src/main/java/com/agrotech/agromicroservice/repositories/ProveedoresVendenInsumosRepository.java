package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.ProveedoresVendenInsumos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresVendenInsumosRepository extends JpaRepository<ProveedoresVendenInsumos, Long> {
}
