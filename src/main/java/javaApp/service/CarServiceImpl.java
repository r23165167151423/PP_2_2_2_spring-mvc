package javaApp.service;

import javaApp.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("BMW", "M5", 2020),
            new Car("Audi", "A6", 2019),
            new Car("Toyota", "Camry", 2021),
            new Car("Tesla", "Model 3", 2022),
            new Car("Ford", "Mustang", 2018)
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, count));
    }
}