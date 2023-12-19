package com.example.spring_mysql_demo.controllers;

import com.example.spring_mysql_demo.models.Car;
import com.example.spring_mysql_demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cars")
public class CarsController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/{id}")
    public Car read(@PathVariable int id){
        var optionalCar = carRepository.findById(id);
        return optionalCar.orElse(null);

    }

    @PostMapping("/")
    public Car create(@RequestBody Car car){
        carRepository.save(car);
        return car;
    }

    @PutMapping(path = "/update/{id}")
    public @ResponseBody String updateUser(@PathVariable Integer id, @RequestParam String make, @RequestParam String model, @RequestParam Integer year){
        var optionalCar = carRepository.findById(id);

        if (optionalCar.isEmpty()){
            return "NOT FOUND";
        }
        var car = optionalCar.get();
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);
        carRepository.save(car);

        return "Updated";
    }

    @DeleteMapping(path = "/delete")
    public @ResponseBody String deleteCar(@RequestParam Integer id){
        carRepository.deleteById(id);
        return "Deleted Car with ID: " + id;
    }

}
