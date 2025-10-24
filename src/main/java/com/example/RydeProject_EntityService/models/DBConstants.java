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
public class DBConstants extends BaseModel{

    @Column(unique = true , nullable = false)
    private String name;


    private String value;
}
