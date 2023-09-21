package com.agrotech.agromicroservice.repositories;

import com.agrotech.agromicroservice.entities.ClientesCompranConsechas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesCompranCosechasRepository extends JpaRepository<ClientesCompranConsechas, Long> {
}
