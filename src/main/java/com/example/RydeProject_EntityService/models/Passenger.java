package com.example.RydeProject_EntityService.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;


//    private String passengerId;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> pBooking = new ArrayList<>();

    @OneToOne
    private Booking activeBooking;

    @DecimalMin(value="0.0" , message = "rating must be greater than or equal to 0.0")
    @DecimalMax(value="5.0" , message = "rating must be less than or equal to 5.0")
    private Double rating;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation lastKnownLocation;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation home;
}
