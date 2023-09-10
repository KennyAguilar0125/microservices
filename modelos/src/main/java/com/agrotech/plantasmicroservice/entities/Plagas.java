package com.agrotech.plantasmicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Plaga")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Plagas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    private String tratamiento;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    /*@OneToMany(mappedBy = "plaga", cascade = CascadeType.ALL)
    private List<PlantasPlagas> plantasPlagas;*/

    public Plagas (Long id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Plagas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                '}';
    }
}
