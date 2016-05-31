package br.com.workshop.javaee.jaxrs.service;

import br.com.workshop.javaee.domain.Car;
import br.com.workshop.javaee.domain.Plate;

import java.util.*;

/**
 * Created by gabriel on 29/05/16.
 */
public class CarService {

    private final Map<Plate, Car> database = new HashMap<>();

    public List<Car> list() {
        return new ArrayList<>(database.values());
    }

    public Car save(Car car) {
        database.put(car.getPlate(), car);
        return car;
    }

    public void update(Car car) {
        if (!database.containsKey(car.getPlate())) {
            throw new IllegalArgumentException("Car doest not exists!");
        }
        database.put(car.getPlate(), car);
    }

    public void delete(Plate carPlate) {
        database.remove(carPlate);
    }
}
