package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Insumo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Insumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @NotEmpty
    @Column(name = "costo", nullable = false)
    private String costo;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "inventaro_id", nullable = false)
    private Inventarios inventarios;

    @Override
    public String toString() {
        return "Insumos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", costo='" + costo + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", inventarios=" + inventarios +
                '}';
    }
}
