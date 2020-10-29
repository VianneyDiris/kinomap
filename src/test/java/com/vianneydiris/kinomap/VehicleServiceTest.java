package com.vianneydiris.kinomap;

import com.vianneydiris.kinomap.model.Vehicle;
import com.vianneydiris.kinomap.service.VehicleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;

@ExtendWith(MockitoExtension.class)
public class VehicleServiceTest {
    VehicleService service = new VehicleService();

    @Test
    public void getAllVehiclesTests(){
        List<Vehicle> vehicles = service.getAllVehicles();
        Assertions.assertTrue(vehicles.size()>0);
    }
}
