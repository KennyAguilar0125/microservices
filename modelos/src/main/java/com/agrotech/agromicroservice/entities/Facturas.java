package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Factura")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "numero_factura", nullable = false)
    private String numeroFactura;

    @NotNull
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @NotNull
    @Column(name = "total", nullable = false)
    private double total;

    @NotEmpty
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @Override
    public String toString() {
        return "Facturas{" +
                "id=" + id +
                ", numeroFactura='" + numeroFactura + '\'' +
                ", fecha=" + fecha +
                ", total=" + total +
                ", tipo='" + tipo + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                '}';
    }
}
