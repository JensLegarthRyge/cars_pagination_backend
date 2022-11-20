package com.example.cars_pagniation_exercise.service;

import com.example.cars_pagniation_exercise.dto.CarResponse;
import com.example.cars_pagniation_exercise.entity.Car;
import com.example.cars_pagniation_exercise.repositories.CarRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarResponse> getAllCars(){
        List<Car> allCars = carRepository.findAll();
        return allCars.stream().map(car -> new CarResponse(car)).collect(Collectors.toList());
    }

    public List<CarResponse> getCarsFilter(String column, String value, Pageable pageable){
        /*
        List<CarResponse> carResponsesBrand = carRepository.findCarByBrand(pageable, value).stream().map(car -> new CarResponse()).collect(Collectors.toList());
        List<CarResponse> carResponsesColor = carRepository.findCarByColor(pageable, value).stream().map(car -> new CarResponse()).collect(Collectors.toList());
        List<CarResponse> carResponsesModel = carRepository.findCarsByModel(pageable, value).stream().map(car -> new CarResponse()).collect(Collectors.toList());
        List<CarResponse> carResponsesKilometer = carRepository.findCarByKilometers(pageable, value).stream().map(car -> new CarResponse()).collect(Collectors.toList());

         */

         return switch (column){
            case ("brand") -> carRepository.findCarByBrand(pageable, value).stream().map(car -> new CarResponse(car)).collect(Collectors.toList());
            case ("color") -> carRepository.findCarByColor(pageable, value).stream().map(car -> new CarResponse(car)).collect(Collectors.toList());
            case ("model") -> carRepository.findCarByModel(pageable, value).stream().map(car -> new CarResponse(car)).collect(Collectors.toList());
            case ("kilometers") -> carRepository.findCarByKilometers(pageable, value).stream().map(car -> new CarResponse(car)).collect(Collectors.toList());
             default -> null;
        };

        /*
        return switch (column){
            case("brand") -> carResponsesBrand;
            case("color") -> carResponsesColor;
            case("model") -> carResponsesModel;
            case("kilometers") -> carResponsesKilometer;
            default -> null;
        };

         */
    }


}
