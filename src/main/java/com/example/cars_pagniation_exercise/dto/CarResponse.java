package com.example.cars_pagniation_exercise.dto;


import com.example.cars_pagniation_exercise.entity.Car;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarResponse {
    Integer id;
    String brand;
    String model;
    String color;
    Integer kilometers;

    public CarResponse(Car c){
        this.id = c.getId();
        this.brand = c.getBrand();
        this.model = c.getModel();
        this.color = c.getColor();
        this.kilometers = c.getKilometers();
    }
}
