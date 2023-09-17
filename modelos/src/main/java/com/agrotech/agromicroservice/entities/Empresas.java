package com.agrotech.agromicroservice.entities;

import com.agrotech.plantasmicroservice.entities.Plantas;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Empresa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;

    private String direccion;

    private String telefono;

    @Override
    public String toString() {
        return "Empresas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
