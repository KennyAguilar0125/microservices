package com.agrotech.securitymicroservice.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GeneralUtilitiesSecurity {
    /**
     * Restemplate inyectado para la utilización en los modelos
     * en los que no es posible realizar inyección
     */
    public static RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        GeneralUtilitiesSecurity.restTemplate = restTemplate;
    }
}
