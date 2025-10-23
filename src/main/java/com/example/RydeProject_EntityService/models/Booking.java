package com.example.RydeProject_EntityService.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{

//    @OneToOne(cascade ={ CascadeType.PERSIST , CascadeType.REMOVE})
//    private Review review;
        @OneToOne(mappedBy = "booking")
        private com.example.RydeReviewService.models.Review review;

    @Enumerated(value = EnumType.STRING)// Stores enum as it is  string in database default in tinyint
    private com.example.RydeReviewService.models.BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP) // By default its timestamp itself but we are entioning specifically
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne
    private com.example.RydeReviewService.models.Driver driver;

    @ManyToOne
    private com.example.RydeReviewService.models.Passenger passenger;

}
