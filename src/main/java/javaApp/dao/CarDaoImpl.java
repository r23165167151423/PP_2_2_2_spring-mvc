package javaApp.dao;

import javaApp.model.Car;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = Arrays.asList(
            new Car("BMW", "M5", 2020),
            new Car("Audi", "A6", 2019),
            new Car("Toyota", "Camry", 2021),
            new Car("Tesla", "Model 3", 2022),
            new Car("Ford", "Mustang", 2018)
    );

    public List<Car> getAllCars() {
        return cars;
    }
}
