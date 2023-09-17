package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Cosecha")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cosechas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    private String descripcion;

    @Column(name = "fecha_cosecha")
    @Temporal(TemporalType.DATE)
    private Date fechaCosecha;

    @Column(name = "cantidad_cosecha")
    private double cantidadCosecha;

    @Column(name = "costo_coscha")
    private double costoCosecha;

    @Column(name = "precio_venta")
    private double precioVenta;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "siembra_id", nullable = false)
    private Cultivos cultivos;


    @Override
    public String toString() {
        return "Cosechas{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCosecha=" + fechaCosecha +
                ", cantidadCosecha=" + cantidadCosecha +
                ", costoCosecha=" + costoCosecha +
                ", precioVenta=" + precioVenta +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", cultivos=" + cultivos +
                '}';
    }
}
