package exceptions;

public class FalseParametersException extends RuntimeException{

    public String message;

    public FalseParametersException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
