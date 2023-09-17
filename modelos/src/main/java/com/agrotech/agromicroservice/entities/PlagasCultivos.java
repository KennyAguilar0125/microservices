package com.agrotech.agromicroservice.entities;

import com.agrotech.plantasmicroservice.entities.Plagas;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Plaga_cultivo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlagasCultivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "fecha_deteccion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaDeteccion;

    private String descripcion;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "cultivo_id")
    private Cultivos cultivos;

    @ManyToOne
    @JoinColumn(name = "plaga_id")
    private Plagas plagas;

    @Override
    public String toString() {
        return "PlagasCultivos{" +
                "id=" + id +
                ", fechaDeteccion=" + fechaDeteccion +
                ", descripcion='" + descripcion + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", cultivos=" + cultivos +
                ", plagas=" + plagas +
                '}';
    }
}
