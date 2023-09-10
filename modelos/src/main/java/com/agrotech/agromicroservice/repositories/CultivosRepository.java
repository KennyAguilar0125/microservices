package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Cultivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CultivosRepository extends JpaRepository<Cultivos, Long> {
}
