package com.example.RydeProject_EntityService.models;


import jakarta.persistence.*;
import lombok.*;

import com.example.RydeProject_EntityService.models.Colors;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car extends BaseModel {

    private String numberPlate;

    @ManyToOne
    private Colors color;


    private String brand;

    private String model;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;

    @OneToOne(fetch = FetchType.LAZY)
    private Driver driver;




}
