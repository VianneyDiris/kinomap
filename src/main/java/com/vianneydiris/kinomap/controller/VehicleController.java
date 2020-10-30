package com.vianneydiris.kinomap.controller;

import com.vianneydiris.kinomap.model.*;
import com.vianneydiris.kinomap.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehicleController {
    private VehicleService vehicleService;
    private List<Vehicle> vehicles;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
        Vehicle vehicle1 = new Vehicle( 3L,"4x4",null,new Icon(new Anchor(33,32),
                new Size(32,66),
                new Url("https://static.kinomap.com/img/icons/km_4x4l.png","https://static.kinomap.com/img/icons/km_4x4r.png","https://static.kinomap.com/img/icons/50x50/km_4x4.png")));
        Vehicle vehicle2 = new Vehicle( 50L,"Balloon",null,new Icon(new Anchor(24,59),
                new Size(60,50),
                new Url("https://static.kinomap.com/img/icons/km_balloonl.png","https://static.kinomap.com/img/icons/km_balloonr.png","https://static.kinomap.com/img/icons/50x50/km_balloon.png")));
        vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("vehicles", vehicles);

        return "index"; //view
    }
}
