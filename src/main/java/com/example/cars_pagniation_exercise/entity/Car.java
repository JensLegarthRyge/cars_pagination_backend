package com.example.cars_pagniation_exercise.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Car {
    @Id
    int id;
    String brand;
    String model;
    String color;
    int kilometers;
}
