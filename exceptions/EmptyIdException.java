package exceptions;

public class EmptyIdException extends RuntimeException {

    private String message;

    public EmptyIdException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void IdError() {

    }

}

