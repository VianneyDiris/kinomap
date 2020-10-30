package com.vianneydiris.kinomap.service;

import com.vianneydiris.kinomap.model.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Vehicle service test.
 */
class VehicleServiceTest {
    /**
     * The Service.
     */
    VehicleService service = new VehicleService();

    /**
     * Get all vehicles tests.
     */
    @Test
    public void getAllVehiclesTests(){
        List<Vehicle> vehicles = service.getAllVehicles();
        Assertions.assertTrue(vehicles.size()>0);
    }
}