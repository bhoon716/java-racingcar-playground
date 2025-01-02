package view;

import domain.Car;
import domain.RaceResultDto;

import java.util.List;

public interface OutputView {

    void printEnterCarNames();

    void printEnterTimes();

    void printString(String str);

    void printRaceResult(RaceResultDto raceResult);

    void printWinner(List<Car> winner);
}
