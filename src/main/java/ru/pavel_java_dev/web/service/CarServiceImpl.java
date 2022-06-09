package ru.pavel_java_dev.web.service;

import org.springframework.stereotype.Component;
import ru.pavel_java_dev.web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static long count;
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        count = 0;

        cars.add(new Car(++count, "BMW", 7));
        cars.add(new Car(++count, "Mercedes", 600));
        cars.add(new Car(++count, "Nissan", 350));
        cars.add(new Car(++count, "Audi", 8));
        cars.add(new Car(++count, "Lada", 6));
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void add(String model, int series) {
        add(new Car(++count, model, series));
    }

    public List<Car> listCars() {
        return cars;
    }

    public List<Car> listCars(int n) {
        if (n < 5) {
            return cars.subList(0, n);
        } else {
            return cars;
        }
    }
}