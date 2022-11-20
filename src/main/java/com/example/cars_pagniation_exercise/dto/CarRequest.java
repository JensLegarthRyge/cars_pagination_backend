package com.example.cars_pagniation_exercise.dto;

import com.example.cars_pagniation_exercise.entity.Car;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarRequest {
    int id;
    String brand;
    String model;
    String color;
    int kilometers;

    public static Car getCarEntity(CarRequest c){
        return new Car (c.id, c.getBrand(), c.getModel(), c.getColor(), c.getKilometers());
    }

    public CarRequest(Car c){
        this.id = c.getId();
        this.brand = c.getBrand();
        this.model = c.getModel();
        this.color = c.getColor();
        this.kilometers = c.getKilometers();
    }
}
