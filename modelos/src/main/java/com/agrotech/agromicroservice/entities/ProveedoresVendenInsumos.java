package com.agrotech.agromicroservice.entities;

import com.agrotech.usuariosmicroservice.entities.Proveedores;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Proveedor_vende_insumo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProveedoresVendenInsumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "unidades", nullable = false)
    private int unidades;

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
    @JoinColumn(name = "proveedor_id")
    private Proveedores proveedores;

    @ManyToOne
    @JoinColumn(name = "insumo_id")
    private Insumos insumos;

    @ManyToOne
    @JoinColumn(name = "Factura_id")
    private Facturas facturas;

    @Override
    public String toString() {
        return "ProveedoresVendenInsumos{" +
                "id=" + id +
                ", unidades=" + unidades +
                ", costo='" + costo + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", proveedores=" + proveedores +
                ", insumos=" + insumos +
                ", facturas=" + facturas +
                '}';
    }
}
