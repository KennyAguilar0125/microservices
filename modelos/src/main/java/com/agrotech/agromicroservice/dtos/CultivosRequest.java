package com.agrotech.agromicroservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CultivosRequest {

    private Date fechaSiembra;
    private int cantidadSemillas;
    private double costoSemillas;
    private Long plantaId;
}
