package com.example.cars_pagniation_exercise.api;

import com.example.cars_pagniation_exercise.dto.CarResponse;
import com.example.cars_pagniation_exercise.service.CarService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/cars")
public class CarController {

    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    List<CarResponse> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("/filter")
    List<CarResponse> getCarsFiltered(@RequestParam("column") String column, @RequestParam("value") String value, Pageable pageable){
        return carService.getCarsFilter(column ,value, pageable);
    }
}
