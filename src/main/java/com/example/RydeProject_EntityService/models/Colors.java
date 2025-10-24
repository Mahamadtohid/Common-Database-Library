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
public class Colors extends BaseModel{

    @Column(nullable = true , unique = true)
    private String colorName;
}
