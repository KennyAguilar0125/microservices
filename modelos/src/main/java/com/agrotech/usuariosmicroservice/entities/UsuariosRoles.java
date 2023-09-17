package com.agrotech.usuariosmicroservice.entities;

import com.agrotech.agromicroservice.entities.Empresas;
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
public class UsuariosRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuarios usuarios;

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
        return "UsuariosRoles{" +
                "id=" + id +
                ", usuarios=" + usuarios +
                ", roles=" + roles +
                '}';
    }
}
