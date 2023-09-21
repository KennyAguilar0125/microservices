package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.ActividadesCultivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadesCultivosRepository extends JpaRepository<ActividadesCultivos, Long> {
}
