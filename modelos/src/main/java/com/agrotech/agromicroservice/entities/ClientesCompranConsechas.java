package com.agrotech.agromicroservice.entities;

import com.agrotech.usuariosmicroservice.entities.Clientes;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "Cliente_compra_cosecha")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientesCompranConsechas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "unidades", nullable = false)
    private int unidades;

    @NotEmpty
    @Column(name = "precio_unidad", nullable = false)
    private String precioUnidad;

    @ManyToOne
    @JoinColumn(name = "cocecha_id", nullable = false)
    private Cosechas cosechas;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Clientes clientes;

    @ManyToOne
    @JoinColumn(name = "factura_gastos_id", nullable = false)
    private Facturas facturas;

    @Override
    public String toString() {
        return "ClientesCompranConsechas{" +
                "id=" + id +
                ", unidades=" + unidades +
                ", precioUnidad='" + precioUnidad + '\'' +
                ", cosechas=" + cosechas +
                ", clientes=" + clientes +
                ", facturas=" + facturas +
                '}';
    }
}
