package com.example.cars_pagniation_exercise.repositories;

import com.example.cars_pagniation_exercise.entity.Car;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findCarByBrand(Pageable pageable, String brand);
    List<Car> findCarByModel(Pageable pageable, String model);
    List<Car> findCarByColor(Pageable pageable, String color);
    List<Car> findCarByKilometers(Pageable pageable, String kilometers);
}
