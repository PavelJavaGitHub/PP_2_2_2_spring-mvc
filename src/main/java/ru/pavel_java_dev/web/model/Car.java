package ru.pavel_java_dev.web.model;

public class Car {
    private final long id;
    private final String model;
    private final int series;

    public Car(long id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
