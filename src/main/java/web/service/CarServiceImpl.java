package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private int SERIES = 100;

    @Override
    public List<Car> carList(int count) {
        List<Car> cars;
        {
            cars = new ArrayList<>();
            cars.add(new Car("car1", "Black", ++SERIES));
            cars.add(new Car("car2", "Red", ++SERIES));
            cars.add(new Car("car3", "Green", ++SERIES));
            cars.add(new Car("car4", "Blue", ++SERIES));
            cars.add(new Car("car5", "Orange", ++SERIES));

        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
