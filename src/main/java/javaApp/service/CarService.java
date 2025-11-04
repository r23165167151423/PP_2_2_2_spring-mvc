package javaApp.service;

import javaApp.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}
