package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Zona")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Zonas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "metros_cuadrados")
    private double metrosCuadrados;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "parcela_id", nullable = false)
    private Parcelas parcelas;

    @Override
    public String toString() {
        return "Zonas{" +
                "id=" + id +
                ", metrosCuadrados=" + metrosCuadrados +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", parcelas=" + parcelas +
                '}';
    }
}
