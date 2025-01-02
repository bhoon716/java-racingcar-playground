package view;

import domain.Car;
import domain.RaceResultDto;

import java.util.ArrayList;
import java.util.List;

public class OutputViewImpl implements OutputView{

    @Override
    public void printEnterCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    @Override
    public void printEnterTimes() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    @Override
    public void printString(String str) {
        System.out.println(str);
    }

    @Override
    public void printRaceResult(RaceResultDto raceResult) {
        System.out.println(raceResult.toString()+"\n");
    }

    @Override
    public void printWinner(List<Car> winner) {
        List<String> winnerName = new ArrayList<>();
        winner.forEach(car -> winnerName.add(car.getCarName()));
        String winners = String.join(", ", winnerName);
        System.out.print("최종 우승자 : " + winners);

    }
}
