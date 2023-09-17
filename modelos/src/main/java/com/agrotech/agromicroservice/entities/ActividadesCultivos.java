package com.agrotech.agromicroservice.entities;

import com.agrotech.plantasmicroservice.entities.Mantenimientos;
import com.agrotech.plantasmicroservice.entities.Plantas;
import com.agrotech.usuariosmicroservice.entities.Usuarios;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Actividad_cultivo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActividadesCultivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    private String estado;

    private double valor;

    @NotEmpty
    @Column(name = "tipo_egreso", nullable = false)
    private String tipoEgreso;

    @Column(name = "es_periodica", nullable = false)
    private boolean esPeriodica;


    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "periocidad_id")
    private Periocidades periocidades;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "cultivo_id")
    private Cultivos cultivos;

    @ManyToOne
    @JoinColumn(name = "mantenimiento_id")
    private Mantenimientos mantenimientos;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    private Facturas facturas;

    @Override
    public String toString() {
        return "ActividadesCultivos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", valor=" + valor +
                ", tipoEgreso='" + tipoEgreso + '\'' +
                ", esPeriodica=" + esPeriodica +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", periocidades=" + periocidades +
                ", usuarios=" + usuarios +
                ", cultivos=" + cultivos +
                ", mantenimientos=" + mantenimientos +
                ", facturas=" + facturas +
                '}';
    }
}
