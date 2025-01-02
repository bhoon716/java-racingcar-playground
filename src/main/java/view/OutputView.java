package view;

import domain.RaceResultDto;

public interface OutputView {

    void printEnterCarNames();

    void printEnterTimes();

    void printString(String str);

    void printRaceResult(RaceResultDto raceResult);
}
