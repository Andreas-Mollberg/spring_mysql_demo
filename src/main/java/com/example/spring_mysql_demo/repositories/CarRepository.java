package com.example.spring_mysql_demo.repositories;

import com.example.spring_mysql_demo.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
