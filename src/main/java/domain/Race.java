package domain;

import util.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car newCar) {
        cars.add(newCar);
    }

    public void startRace(){
        cars.forEach(car -> moveRandomly(car));
    }

    private void moveRandomly(Car car) {
        Integer num = RandomNumberGenerator.generateRandomNumber();
        if(num >= 4){
            car.move();
        }
    }

    public RaceResultDto getRaceResult(){
        RaceResultDto raceResult = new RaceResultDto();
        cars.forEach(car -> raceResult.addResult(car));
        return raceResult;
    }
}
