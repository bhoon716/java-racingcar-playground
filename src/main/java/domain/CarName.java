package domain;

public class CarName {

    private final String name;

    public CarName(String name) {
        this.name = name;

        validateName();
    }

    private void validateName() {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }
}
