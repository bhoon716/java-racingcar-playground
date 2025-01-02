package domain;

import exception.ExceptionMessage;

import java.util.Objects;

public class CarName {

    private final String name;

    public CarName(String name) {
        this.name = name;

        validateName();
    }

    private void validateName() {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_CAR_NAME_LENGTH.getMessage());
        }
        if(name.trim().equals("")){
            throw new IllegalArgumentException(ExceptionMessage.INVALID_EMPTY_CAR_NAME.getMessage());
        }
    }

    @Override
    public boolean equals(final Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        final CarName carName = (CarName) o;
        return name.equals(carName.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
