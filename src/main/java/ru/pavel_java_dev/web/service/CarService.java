package ru.pavel_java_dev.web.service;

import ru.pavel_java_dev.web.model.Car;

import java.util.List;

public interface CarService {

    void add(Car car);

    void add(String model, int series);

    List<Car> listCars();

    List<Car> listCars(int n);
}