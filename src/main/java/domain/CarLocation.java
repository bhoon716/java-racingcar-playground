package domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        final CarLocation carLocation = (CarLocation) o;
        return location == carLocation.location;
    }

    @Override
    public int hashCode(){
        return Objects.hash(location);
    }
}
