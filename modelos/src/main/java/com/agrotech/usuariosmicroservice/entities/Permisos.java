package com.agrotech.usuariosmicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Permiso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Permisos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotEmpty
    @Column(name = "tabla", nullable = false)
    private String tabla;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @Override
    public String toString() {
        return "Permisos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tabla='" + tabla + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                '}';
    }
}
