package domain;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Car> cars = new ArrayList<>();
    private int times;

    public void addCar(Car newCar) {
        cars.add(newCar);
    }

    public void setTimes(int times){
        this.times = times;
    }
}
