package com.agrotech.plantasmicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Mantenimiento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mantenimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    private double cantidad;

    @Column(name = "tipo_mantenimiento")
    private String tipoMantenimiento;

    private String descripcion;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @Override
    public String toString() {
        return "Mantenimientos{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", tipoMantenimiento='" + tipoMantenimiento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                '}';
    }
}
