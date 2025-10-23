package com.example.RydeProject_EntityService.models;
import com.example.RydeReviewService.models.Review;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends Review {

    private String passengerReviewComment;
}
