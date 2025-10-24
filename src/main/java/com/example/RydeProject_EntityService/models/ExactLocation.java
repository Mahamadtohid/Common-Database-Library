package com.example.RydeProject_EntityService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExactLocation extends BaseModel{

    private Double latitude;

    private Double longitude;
}
