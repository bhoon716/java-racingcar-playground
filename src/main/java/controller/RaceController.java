package controller;

import service.RaceServiceImpl;
import view.InputView;
import view.OutputView;

public class RaceController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RaceServiceImpl raceService;

    public RaceController(InputView inputView, OutputView outputView, RaceServiceImpl raceService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.raceService = raceService;
    }

    public void startRace() {
        outputView.printEnterCarNames();
        String carNames = inputView.readCarNames();
        raceService.setCars(carNames);
    }
}
