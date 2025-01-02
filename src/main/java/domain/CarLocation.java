package domain;

public class CarLocation {

    private int location;

    public CarLocation() {
        this.location = 0;
    }

    public int getLocation() {
        return location;
    }

    public void move(){
        location++;
    }
}
