package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Parcela")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parcelas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotEmpty
    @Column(name = "tipo", nullable = false)
    private String tipo;

    private double latitud;

    private double longitud;

    private double altitud;

    private String descripcion;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresas empresas;
}
