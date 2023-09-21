package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Municipios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipiosRepository extends JpaRepository<Municipios, Long> {
}