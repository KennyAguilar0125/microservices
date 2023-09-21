package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Cosechas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CosechasRepository extends JpaRepository<Cosechas, Long> {
}
