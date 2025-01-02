package util;

import java.util.Random;

public class RandomNumberGenerator {

    public static Integer generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
