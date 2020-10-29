package com.vianneydiris.kinomap.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class VehicleList {
        private List<Vehicle> vehicles;

        public VehicleList() {
            vehicles = new ArrayList<>();
        }


}
