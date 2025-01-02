package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차전진테스트_한칸(){
        Car car = new Car(new CarName("test"), new CarLocation());

        car.move();

        assertThat(car.getCarLocation()).isEqualTo(1);
    }

    @Test
    void 자동차전진테스트_여러칸(){
        Car car = new Car(new CarName("test"), new CarLocation());

        car.move();
        car.move();
        car.move();

        assertThat(car.getCarLocation()).isEqualTo(3);
    }
}