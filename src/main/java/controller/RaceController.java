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

    public void initRace() {
        outputView.printEnterCarNames();
        String carNames = inputView.readCarNames();
        raceService.setCars(carNames);

        outputView.printEnterTimes();
        int times = inputView.readTimes();
        startRace(times);

    }

    public void startRace(int times){
        for(int i = 0; i < times; i++){
            raceService.startRace();

        }
    }
}
