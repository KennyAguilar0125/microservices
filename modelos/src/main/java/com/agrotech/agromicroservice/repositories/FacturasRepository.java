package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturasRepository extends JpaRepository<Facturas, Long> {
}
