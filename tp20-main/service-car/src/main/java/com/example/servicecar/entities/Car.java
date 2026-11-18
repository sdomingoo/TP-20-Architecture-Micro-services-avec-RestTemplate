package com.example.servicecar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Long client_id;

    public  Car(String brand, String model, String matricule, Long client_id) {
        this.brand = brand;
        this.model = model;
        this.matricule = matricule;
        this.client_id = client_id;
    }
}
