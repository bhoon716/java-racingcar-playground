import controller.RaceController;
import service.RaceService;
import service.RaceServiceImpl;
import view.InputView;
import view.InputViewImpl;
import view.OutputView;
import view.OutputViewImpl;

public class RaceApp {

    public static void main(String[] args){
        final InputView inputView = new InputViewImpl();
        final OutputView outputView = new OutputViewImpl();
        final RaceService raceService = new RaceServiceImpl();
        final RaceController raceController = new RaceController(inputView, outputView, raceService);

        raceController.initRace();
    }
}
