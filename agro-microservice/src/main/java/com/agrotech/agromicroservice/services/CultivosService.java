package com.agrotech.agromicroservice.services;

import com.agrotech.agromicroservice.dtos.CultivosRequest;
import com.agrotech.agromicroservice.entities.Cultivos;
import com.agrotech.agromicroservice.repositories.CultivosRepository;
import com.agrotech.agromicroservice.utilities.GeneralUtilitiesAgro;
import com.agrotech.plantasmicroservice.entities.Plantas;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.agrotech.utilities.GeneralUtilities.plantasMicroservice;

@Service
@RequiredArgsConstructor
@Slf4j
public class CultivosService {

    private static final String micro = plantasMicroservice + "plantas";
    private final CultivosRepository repository;

    public List<Cultivos> findAll(){
        return repository.findAll(Sort.by("id").ascending());
    }

    public Cultivos create(CultivosRequest dto) {

        List<Plantas> result = Arrays.asList(Objects.requireNonNull(GeneralUtilitiesAgro.restTemplate.getForObject(micro, Plantas[].class)));
        System.out.println(result);


            var cultivo = Cultivos.builder()
                    .fechaSiembra(dto.getFechaSiembra())
                    .cantidadSemillas(dto.getCantidadSemillas())
                    .costoSemillas(dto.getCostoSemillas())
                    .creadoEn(new Timestamp(System.currentTimeMillis()))
                    .actualizadoEn(new Timestamp(System.currentTimeMillis()))
                    .build();

        return repository.save(cultivo);
    }



}
