package domain;

import exception.ExceptionMessage;
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

    @Test
    void 자동차생성실패(){
        String name1 = "errorTest";
        String name2 = "    ";

        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class, () ->{
            new Car(new CarName(name1), new CarLocation());
        });
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class, () -> {
            new Car(new CarName(name2), new CarLocation());
        });

        assertThat(e1.getMessage()).isEqualTo(ExceptionMessage.INVALID_CAR_NAME_LENGTH.getMessage());
        assertThat(e2.getMessage()).isEqualTo(ExceptionMessage.INVALID_EMPTY_CAR_NAME.getMessage());
    }
}