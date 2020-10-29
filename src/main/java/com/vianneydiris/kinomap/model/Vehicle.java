package com.vianneydiris.kinomap.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {
    private Long id;
    private String name;
    private String training;
    private Icon icon;
}
