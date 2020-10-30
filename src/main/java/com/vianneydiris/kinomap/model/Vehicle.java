package com.vianneydiris.kinomap.model;

import lombok.*;

import java.io.Serializable;

/**
 * The type Vehicle.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle implements Serializable {
    private Long id;
    private String name;
    private String training;
    private Icon icon;
}
