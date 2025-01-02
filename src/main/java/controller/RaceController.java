package controller;

import domain.Car;
import domain.RaceResultDto;
import service.RaceService;
import view.InputView;
import view.OutputView;

import java.util.List;

public class RaceController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RaceService raceService;

    public RaceController(InputView inputView, OutputView outputView, RaceService raceService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.raceService = raceService;
    }

    public void initRace() {
        outputView.printEnterCarNames();
        String carNames = inputView.readCarNames();
        raceService.setCars(carNames);

        outputView.printEnterTimes();
        int times = inputView.readTimes();
        startRace(times);
        printWinner();
    }

    private void startRace(int times){
        outputView.printString("\n실행 결과");
        for(int i = 0; i < times; i++){
            raceService.startRace();
            RaceResultDto raceResult = raceService.getRaceResult();
            outputView.printRaceResult(raceResult);
        }
    }

    private void printWinner() {
        List<Car> winner = raceService.getWinner();
        outputView.printWinner(winner);
    }
}
