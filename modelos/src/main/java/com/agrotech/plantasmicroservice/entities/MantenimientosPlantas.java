package com.agrotech.plantasmicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Mantenimiento_planta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MantenimientosPlantas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mantenimiento_id")
    private Mantenimientos mantenimientos;

    @ManyToOne
    @JoinColumn(name = "planta_id")
    private Plantas plantas;

    @Override
    public String toString() {
        return "MantenimientosPlantas{" +
                "id=" + id +
                ", mantenimientos=" + mantenimientos +
                ", plantas=" + plantas +
                '}';
    }
}
