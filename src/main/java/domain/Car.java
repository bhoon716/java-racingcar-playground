package domain;

public class Car {

    private final CarName carName;
    private final CarLocation carLocation;

    public Car(CarName carName, CarLocation carLocation) {
        this.carName = carName;
        this.carLocation = carLocation;
    }

    public void move(){
        carLocation.move();
    }

    public int getCarLocation(){
        return carLocation.getLocation();
    }

    @Override
    public String toString(){
        return carName + " : " + carLocation;
    }
}
