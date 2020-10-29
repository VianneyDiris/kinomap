package com.vianneydiris.kinomap.service;

import com.vianneydiris.kinomap.model.Vehicle;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VehicleService {
    final String uri = "http://api.kinomap.com/vehicle/list?icon=1&lang=en-gb&forceStandard=1&outputFormat\n" +
            "=json&appToken=8qohg5a9c6q6x58szpyxizvp91yary3setxdxutl10dugtel1syjs6gmrp33o\n" +
            "o40a356j2cxt6vdcpzg095drsym5blnyen0hi4bdq32j61clfux2i9vtuhr";

    public List<Vehicle> getAllVehicles(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Vehicle>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Vehicle>>(){});
        List<Vehicle> vehicles = response.getBody();

        return vehicles;
    }

}
