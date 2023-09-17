package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Municipio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Municipios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamentos departamentos;

    @Override
    public String toString() {
        return "Municipios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", departamentos=" + departamentos +
                '}';
    }
}
