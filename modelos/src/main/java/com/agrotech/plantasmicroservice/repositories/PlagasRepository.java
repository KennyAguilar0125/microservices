package com.agrotech.plantasmicroservice.repositories;


import com.agrotech.plantasmicroservice.entities.Plagas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlagasRepository extends JpaRepository<Plagas, Long> {
}
