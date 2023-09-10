package com.agrotech.agromicroservice.entities;

import com.agrotech.plantasmicroservice.entities.Plantas;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Cultivo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cultivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "fecha_siembra", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaSiembra;

    @Column(name = "cantidad_semillas")
    private int cantidadSemillas;

    @Column(name = "costo_semillas")
    private double costoSemillas;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "planta_id")
    private Plantas plantas;

    @Override
    public String toString() {
        return "Cultivos{" +
                "id=" + id +
                ", fechaSiembra=" + fechaSiembra +
                ", cantidadSemillas=" + cantidadSemillas +
                ", costoSemillas=" + costoSemillas +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                '}';
    }
}
