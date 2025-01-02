package service;

import domain.*;

import java.util.Arrays;

public class RaceServiceImpl implements RaceService{

    private final Race race = new Race();

    @Override
    public void setCars(String carNames) {
        String[] names = carNames.split(",");
        Arrays.stream(names).forEach(name -> {
            CarName carName = new CarName(name);
            CarLocation carLocation = new CarLocation();
            Car car = new Car(carName, carLocation);
            race.addCar(car);
        });
    }

    @Override
    public void startRace() {
        race.startRace();
    }

    @Override
    public RaceResultDto getRaceResult() {
        return race.getRaceResult();
    }
}
