package domain;

public class Car {

    private final CarName carName;
    private final CarLocation carLocation;

    public Car(CarName carName, CarLocation carLocation) {
        this.carName = carName;
        this.carLocation = carLocation;
    }
}
