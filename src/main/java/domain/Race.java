package domain;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car newCar) {
        cars.add(newCar);
    }
}
