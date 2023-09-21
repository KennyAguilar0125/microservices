package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Parcelas;
import com.agrotech.agromicroservice.entities.Periocidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriocidadesRepository extends JpaRepository<Periocidades, Long> {
}
