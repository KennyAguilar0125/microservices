package com.agrotech.plantasmicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "planta_plaga")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlantasPlagas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sintoma;

    @ManyToOne
    @JoinColumn(name = "planta_id")
    private Plantas plantas;

    @ManyToOne
    @JoinColumn(name = "plaga_id")
    private Plagas plagas;

    @Override
    public String toString() {
        return "PlantasPlagas{" +
                "id=" + id +
                ", sintoma='" + sintoma + '\'' +
                ", plantas=" + plantas +
                ", plagas=" + plagas +
                '}';
    }
}
