package exception;

public enum ExceptionMessage {

    INVALID_CAR_NAME_LENGTH("자동차 이름 5 초과"),
    INVALID_EMPTY_CAR_NAME("잘못된 자동차 이름");

    ExceptionMessage(String message) {
    }

    public String getMessage() {
        return "[오류]: " + name();
    }
}