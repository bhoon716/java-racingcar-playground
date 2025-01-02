package view;

import java.util.Scanner;

public class InputViewImpl implements InputView{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String readCarNames() {
        return scanner.nextLine();
    }

    @Override
    public Integer readTimes() {
        return scanner.nextInt();
    }
}
