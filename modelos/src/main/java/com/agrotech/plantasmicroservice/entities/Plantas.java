package com.agrotech.plantasmicroservice.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Planta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Plantas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    @Column(name = "plan_emergencia")
    private String planEmergencia;

    @Column(name = "requerimientos_suelo")
    private String requerimientosSuelo;

    private int riegos;

    @Column(name = "creado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    @Column(name = "actualizado_en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizadoEn;

    @Column(name = "url_imagen")
    private String urlImagen;

    /*@OneToMany(mappedBy = "planta", cascade = CascadeType.ALL)
    private List<PlantasPlagas> plantasPlagas;*/

    public Plantas (Long id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Plantas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", planEmergencia='" + planEmergencia + '\'' +
                ", requerimientosSuelo='" + requerimientosSuelo + '\'' +
                ", riegos=" + riegos +
                ", creadoEn=" + creadoEn +
                ", actualizadoEn=" + actualizadoEn +
                ", urlImagen='" + urlImagen + '\'' +
                '}';
    }
}
