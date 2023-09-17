package com.agrotech.usuariosmicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Usuario_rol")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolesPermisos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "permiso_id", nullable = false)
    private Permisos permisos;

    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Roles roles;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @Override
    public String toString() {
        return "RolesPermisos{" +
                "id=" + id +
                ", permisos=" + permisos +
                ", roles=" + roles +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                '}';
    }
}
