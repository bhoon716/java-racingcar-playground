package service;

import domain.RaceResultDto;

public interface RaceService {

    void setCars(String carNames);

    void startRace();

    RaceResultDto getRaceResult();
}