package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.PlagasCultivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlagasCultivosRepository extends JpaRepository<PlagasCultivos, Long> {
}
