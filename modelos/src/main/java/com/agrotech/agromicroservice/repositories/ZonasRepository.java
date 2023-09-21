package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Zonas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonasRepository extends JpaRepository<Zonas, Long> {
}
