package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.RaceService;
import service.RaceServiceImpl;
import view.InputView;
import view.InputViewImpl;
import view.OutputView;
import view.OutputViewImpl;

class RaceControllerTest {

    RaceController raceController;
    InputView inputView;
    OutputView outputView;
    RaceService raceService;

    @BeforeEach
    void setUp() {
        inputView = new InputViewImpl();
        outputView = new OutputViewImpl();
        raceService = new RaceServiceImpl();

        raceController = new RaceController(inputView, outputView, raceService);
    }

    @Test
    void 이동횟수테스트() {

    }
}