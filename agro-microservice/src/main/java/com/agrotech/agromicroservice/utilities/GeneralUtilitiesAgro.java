package com.agrotech.agromicroservice.utilities;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GeneralUtilitiesAgro {
    /**
     * Restemplate inyectado para la utilización en los modelos
     * en los que no es posible realizar inyección
     */
    public static RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        GeneralUtilitiesAgro.restTemplate = restTemplate;
    }
}
