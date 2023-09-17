package com.agrotech.agromicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Periocidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Periocidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dia_semana")
    private String diaSemana;

    @Column(name = "cada_x_dias")
    private String cadaXDias;

    @Override
    public String toString() {
        return "Periocidades{" +
                "id=" + id +
                ", diaSemana='" + diaSemana + '\'' +
                ", cadaXDias='" + cadaXDias + '\'' +
                '}';
    }
}
