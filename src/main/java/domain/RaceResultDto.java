package domain;

import java.util.ArrayList;
import java.util.List;

public class RaceResultDto {

    private final List<String> raceResult = new ArrayList<>();

    public void addResult(Car car) {
        raceResult.add(car.toString());
    }

    @Override
    public String toString(){
        return String.join("\n", raceResult);
    }
}
