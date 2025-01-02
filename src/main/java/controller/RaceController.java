package controller;

import service.RaceService;
import view.InputView;
import view.OutputView;

public class RaceController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RaceService raceService;

    public RaceController(InputView inputView, OutputView outputView, RaceService raceService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.raceService = raceService;
    }

    public void startRace() {
        outputView.printEnterCarNames();
        String carNames = inputView.readCarNames();
        raceService.setCars(carNames);

        outputView.printEnterTimes();
        int times = inputView.readTimes();
        raceService.setTimes(times);
    }
}
