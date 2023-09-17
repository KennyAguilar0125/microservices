package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "Inventario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Inventarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "costo_total", nullable = false)
    private double costoTotal;

    @NotNull
    @Column(name = "cantidad", nullable = false)
    private double cantidad;

    @ManyToOne
    @JoinColumn(name = "parcela_id")
    private Parcelas parcelas;

    @Override
    public String toString() {
        return "Inventarios{" +
                "id=" + id +
                ", costoTotal=" + costoTotal +
                ", cantidad=" + cantidad +
                ", parcelas=" + parcelas +
                '}';
    }
}
