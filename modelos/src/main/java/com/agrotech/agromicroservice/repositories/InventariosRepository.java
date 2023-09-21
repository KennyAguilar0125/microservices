package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.Inventarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventariosRepository extends JpaRepository<Inventarios, Long> {
}
