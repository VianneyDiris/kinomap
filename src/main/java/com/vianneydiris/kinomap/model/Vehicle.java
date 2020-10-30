package com.vianneydiris.kinomap.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


/**
 * The type Vehicle.
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle {
    public Vehicle() {
    }

    private Long id;
    private String name;
    private String training;
    private Icon icon;

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", training='" + training + '\'' +
                ", icon=" + icon +
                '}';
    }
}
