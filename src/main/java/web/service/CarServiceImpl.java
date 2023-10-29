package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarServiceImpl implements CarService {

    private int series = 100;

    @Override
    public List<Car> carList(int count) {
        List<Car> cars;
        {
            cars = new ArrayList<>();
            cars.add(new Car("car1", "Black", ++series));
            cars.add(new Car("car2", "Red", ++series));
            cars.add(new Car("car3", "Green", ++series));
            cars.add(new Car("car4", "Blue", ++series));
            cars.add(new Car("car5", "Orange", ++series));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
