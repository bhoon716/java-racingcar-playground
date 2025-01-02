package service;

import domain.Car;
import domain.RaceResultDto;

import java.util.List;

public interface RaceService {

    void setCars(String carNames);

    void startRace();

    RaceResultDto getRaceResult();

    List<Car> getWinner();
}